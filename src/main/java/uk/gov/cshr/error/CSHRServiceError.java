package uk.gov.cshr.error;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This class is responsible for providing some information about an error encountered in any of the CSHR microservices.
 *
 * It is intended to be used to ensure a common data structure for reporting errors raised in an microservice to calling clients.
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CSHRServiceError {
    private String code;
    private String message;
    private List<String> errors;
}
