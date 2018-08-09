package uk.gov.cshr.status;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;

import org.junit.Test;

/**
 * Tests {@link StatusCode}
 */
public class StatusCodeTest {
    @Test
    public void getCode_RECORD_CREATED() {
        assertThat(StatusCode.RECORD_CREATED.getCode(), is(equalTo("CSHR_10")));
    }

    @Test
    public void getCode_RECORD_UPDATED() {
        assertThat(StatusCode.RECORD_UPDATED.getCode(), is(equalTo("CSHR_11")));
    }

    @Test
    public void getCode_PROCESS_COMPLETED() {
        assertThat(StatusCode.PROCESS_COMPLETED.getCode(), is(equalTo("CSHR_20")));
    }

    @Test
    public void getCode_PROCESS_COMPLETED_WITH_ERRORS() {
        assertThat(StatusCode.PROCESS_COMPLETED_WITH_ERRORS.getCode(), is(equalTo("CSHR_21")));
    }
    
    @Test
    public void getCode_FILE_SYSTEM_ERROR() {
        assertThat(StatusCode.FILE_SYSTEM_ERROR.getCode(), is(equalTo("CSHR_100")));
    }

    @Test
    public void getCode_INTERNAL_SERVICE_ERROR() {
        assertThat(StatusCode.INTERNAL_SERVICE_ERROR.getCode(), is(equalTo("CSHR_200")));
    }

    @Test
    public void getCode_FILE_IS_CLEAN() {
        assertThat(StatusCode.FILE_IS_CLEAN.getCode(), is(equalTo("CSHR_300")));
    }

    @Test
    public void getCode_FILE_IS_DIRTY() {
        assertThat(StatusCode.FILE_IS_DIRTY.getCode(), is(equalTo("CSHR_301")));
    }

    @Test
    public void getCode_FILE_NOT_SCANNED() {
        assertThat(StatusCode.FILE_NOT_SCANNED.getCode(), is(equalTo("CSHR_302")));
    }

    @Test
    public void getCode_NO_RESULTS_FOR_LOCATION() {
        assertThat(StatusCode.NO_RESULTS_FOR_LOCATION.getCode(), is(equalTo("CSHR_400")));
    }

    @Test
    public void getCode_THIRD_PARTY_SERVICE_ERROR() {
        assertThat(StatusCode.THIRD_PARTY_SERVICE_ERROR.getCode(), is(equalTo("CSHR_1000")));
    }
}
