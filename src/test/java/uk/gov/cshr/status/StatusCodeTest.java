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
    public void testGetCode_RECORD_CREATED() {
        assertThat(StatusCode.RECORD_CREATED.getCode(), is(equalTo("CSHR_10")));
    }

    @Test
    public void testGetCode_RECORD_UPDATED() {
        assertThat(StatusCode.RECORD_UPDATED.getCode(), is(equalTo("CSHR_11")));
    }

    @Test
    public void testGetCode_PROCESS_COMPLETED() {
        assertThat(StatusCode.PROCESS_COMPLETED.getCode(), is(equalTo("CSHR_20")));
    }

    @Test
    public void testGetCode_PROCESS_COMPLETED_WITH_ERRORS() {
        assertThat(StatusCode.PROCESS_COMPLETED_WITH_ERRORS.getCode(), is(equalTo("CSHR_21")));
    }

    @Test
    public void testGetCode_FILE_SYSTEM_ERROR() {
        assertThat(StatusCode.FILE_SYSTEM_ERROR.getCode(), is(equalTo("CSHR_100")));
    }

    @Test
    public void testGetCode_INTERNAL_SERVICE_ERROR() {
        assertThat(StatusCode.INTERNAL_SERVICE_ERROR.getCode(), is(equalTo("CSHR_200")));
    }

    @Test
    public void testGetCode_THIRD_PARTY_SERVICE_ERROR() {
        assertThat(StatusCode.THIRD_PARTY_SERVICE_ERROR.getCode(), is(equalTo("CSHR_1000")));
    }
}
