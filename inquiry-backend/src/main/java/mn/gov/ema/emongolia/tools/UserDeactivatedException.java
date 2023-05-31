package mn.gov.ema.emongolia.tools;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class UserDeactivatedException extends Exception {
    public UserDeactivatedException() {
    }

    public UserDeactivatedException(String message) {
        super(message);

    }
}
