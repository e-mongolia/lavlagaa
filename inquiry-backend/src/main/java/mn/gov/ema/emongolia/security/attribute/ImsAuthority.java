package mn.gov.ema.emongolia.security.attribute;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

/**
 * Created by Nasanjargal Bayanmunkh /Б.Насанжаргал/
 * Date: 2017/11/10 11:07 AM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImsAuthority implements GrantedAuthority {
    String authority;
}

