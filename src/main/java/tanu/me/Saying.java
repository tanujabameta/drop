package tanu.me;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

public class Saying {

    @Length(max = 3)
    private String message;


    public Saying(String message) {
        this.message = message;
    }

    @JsonProperty
    public String getMessage() {
        return this.message;
    }
}
