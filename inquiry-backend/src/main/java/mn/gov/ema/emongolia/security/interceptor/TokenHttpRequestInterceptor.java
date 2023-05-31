package mn.gov.ema.emongolia.security.interceptor;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
public class TokenHttpRequestInterceptor extends AbstractTokenRequestClientInterceptor implements ClientHttpRequestInterceptor {

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        String token = getToken();
        if (token != null) {
            request.getHeaders().add("Authorization", token);
        }

        return execution.execute(request, body);
    }


}
