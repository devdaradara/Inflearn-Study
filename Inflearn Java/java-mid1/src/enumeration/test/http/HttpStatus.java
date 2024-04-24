package enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return code >= 200 && code <= 299;
    }

    public static HttpStatus findByCode(int code) {
        if (code == 200) {
            return OK;
        } else if (code == 400) {
            return BAD_REQUEST;
        } else if (code == 404) {
            return NOT_FOUND;
        } else if (code == 500) {
            return INTERNAL_SERVER_ERROR;
        } else {
            return null;
        }
    }
}
