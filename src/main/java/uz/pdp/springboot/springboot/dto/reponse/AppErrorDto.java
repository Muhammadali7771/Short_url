package uz.pdp.springboot.springboot.dto.reponse;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@JsonInclude(JsonInclude.Include.NON_ABSENT)
public class AppErrorDto {
    private final String friendlyMessage;
    private final String developerMessage;
    private final String errorPath;
    private final Integer errorCode;

    public AppErrorDto(String friendlyMessage, String errorPath, Integer errorCode) {
        this(friendlyMessage, friendlyMessage, errorPath, errorCode);
    }

    public AppErrorDto(String friendlyMessage, String developerMessage, String errorPath, Integer errorCode) {
        this.friendlyMessage = friendlyMessage;
        this.developerMessage = developerMessage;
        this.errorPath = errorPath;
        this.errorCode = errorCode;
    }
}
