package uk.gov.cshr.status;

/**
 * Represents some common status codes that could be used across the many microservices
 */
public enum StatusCode {
    // Entity created in a data store
    RECORD_CREATED("CSHR_10"),
    // Entity updated in a data store
    RECORD_UPDATED("CSHR_11"),
    // Service reports an internal status working with files or directories
    FILE_SYSTEM_ERROR("CSHR_100"),
    // General status occurred in the service
    INTERNAL_SERVICE_ERROR("CSHR_200"),
    // An third party service reported an status or some sort in its internal workings.
    THIRD_PARTY_SERVICE_ERROR("CSHR_1000");

    private String code;

    StatusCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
