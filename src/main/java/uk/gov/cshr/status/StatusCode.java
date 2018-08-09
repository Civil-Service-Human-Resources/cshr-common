package uk.gov.cshr.status;

/**
 * Represents some common status codes that could be used across the many microservices
 */
public enum StatusCode {
    // Entity created in a data store
    RECORD_CREATED("CSHR_10"),
    // Entity updated in a data store
    RECORD_UPDATED("CSHR_11"),
    // Requested Process Completed Successfully
    PROCESS_COMPLETED("CSHR_20"),
    // Requested Process Completed Successfully
    PROCESS_COMPLETED_WITH_ERRORS("CSHR_21"),
    // Service reports an internal status working with files or directories
    FILE_SYSTEM_ERROR("CSHR_100"),
    // General status occurred in the service
    INTERNAL_SERVICE_ERROR("CSHR_200"),
    // Scanned file is clean and contains no known viruses or malware
    FILE_IS_CLEAN("CSHR_300"),
    // Scanned file is dirty and contains a known virus or some malware
    FILE_IS_DIRTY("CSHR_301"),
    // File could not be scanned for example it does not exist or there was an internal error trying to scan it
    FILE_NOT_SCANNED("CSHR_302"),
    // No results for location search
    NO_RESULTS_FOR_LOCATION("CSHR_400"),
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
