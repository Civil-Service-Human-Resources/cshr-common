package uk.gov.cshr.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.cshr.error.CSHRServiceStatus;

/**
 * Represents a generic CSHR service exception that wraps an instance of {@link CSHRServiceStatus}
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CSHRServiceException extends RuntimeException {
    private CSHRServiceStatus cshrServiceStatus;
}
