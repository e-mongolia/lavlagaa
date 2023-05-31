package mn.gov.ema.emongolia.tools;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class UserAlreadyExistException extends Exception {
    public UserAlreadyExistException() {
    }
    public UserAlreadyExistException(String message) {
        super(message);
    }
}
