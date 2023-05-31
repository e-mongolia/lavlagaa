package mn.gov.ema.emongolia.security;

import mn.gov.ema.emongolia.security.interceptor.TokenHttpRequestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextListener;
@SuppressWarnings("SpringJavaAutowiringInspection")
@EnableWebSecurity
@Configuration
@ComponentScan("mn.gov.itc.emongolia")
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
@Order(99)
public class ImsAuthentication extends WebSecurityConfigurerAdapter {


    @Autowired
    TokenAuthenticationFilter authenticationTokenFilter;
    @Autowired
    ImsAuthenticationEntryPoint authenticationEntryPoint;
    @Autowired
    ImsAuthenticationProvider authenticationProvider;

    @Bean
    TokenHttpRequestInterceptor tokenHttpRequestInterceptor(RestTemplate restTemplate) {
        TokenHttpRequestInterceptor tokenHttpRequestInterceptor = new TokenHttpRequestInterceptor();
        restTemplate.getInterceptors().add(tokenHttpRequestInterceptor);
        return tokenHttpRequestInterceptor;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
        auth.authenticationProvider(authenticationProvider);
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .csrf().disable()
                .authenticationProvider(authenticationProvider)
                .exceptionHandling().authenticationEntryPoint(authenticationEntryPoint).and()
                .addFilterBefore(authenticationTokenFilter, BasicAuthenticationFilter.class);
        httpSecurity.headers().cacheControl();
    }
    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }
}
