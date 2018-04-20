package uk.gov.cshr.repository;

import static uk.gov.cshr.repository.EntityFinder.findOrEmpty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;

import java.util.Optional;

import org.junit.Test;

/**
 * Tests {@link EntityFinder}
 */
public class EntityFinderTest {
    @Test
    public void testFind_noResultShouldBeFound() {
        Boo boo = new Boo();

        Optional<Foo> foo = findOrEmpty(() -> boo.find("throw"));

        assertThat(foo.isPresent(), is(false));
    }

    @Test
    public void testFind_noResultIsFound() {
        Boo boo = new Boo();

        Optional<Foo> foo = findOrEmpty(() -> boo.find("exists"));

        assertThat(foo.isPresent(), is(true));
    }
}