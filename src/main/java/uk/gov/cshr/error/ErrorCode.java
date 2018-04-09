package uk.gov.cshr.error;

/**
 * Represents some common error codes that could be used across the many microservices
 */
public enum ErrorCode {
    // Service reports an internal error working with files or directories
    FILE_SYSTEM_ERROR("CSHR_100"),
    // An third party service reported an error or some sort in its internal workings.
    THIRD_PARTY_SERVICE_ERROR("CSHR_1000");

    private String code;

    ErrorCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
