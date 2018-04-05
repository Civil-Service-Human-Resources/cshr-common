package uk.gov.cshr.error;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This class is responsible for providing some information the status about an execution of a CSHR endpoint.
 *
 * It is intended to be used to ensure a common data structure for reporting information about the status such as success messages or errors.
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CSHRServiceStatus {
    private String code;
    private String summary;
    private List<String> detail;
}
