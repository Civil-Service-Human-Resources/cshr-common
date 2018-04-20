package uk.gov.cshr.repository;

import javax.persistence.NoResultException;

public class Boo {
    public Foo find(String thing) throws NoResultException {
        if ("throw".equals(thing)) {
            throw new NoResultException();
        }

        return new Foo();
    }
}
