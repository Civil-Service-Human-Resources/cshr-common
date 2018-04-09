package uk.gov.cshr.repository;

import java.util.Optional;

import javax.persistence.NoResultException;

/**
 * Provides a mechanism to handle no result exceptions.
 *
 * It is intended for use in JPA query operations where a NoResultException could be encountered and is a way of
 * decluttering client code for those instances where handling a NoResultException is something that wants to be done.
 *
 * Thanks to https://stackoverflow.com/questions/28249874/best-practice-for-jpa-with-java8s-optional-return for solution
 *
 * @param <T> Optional instance of object to be returned or empty
 */
@FunctionalInterface
public interface EntityFinder<T> {
    T find() throws NoResultException;

    /**
     * Will return the instance of T of present or empty if the implementation of find() throws a NoResultException.
     *
     * @param finder lambda expression that returns an instance of T or throws a NoResultException
     * @param <T> instance to be returned
     * @return Optional instance of T or empty
     */
    static <T> Optional<T> findOrEmpty(final EntityFinder<T> finder) {
        try {
            return Optional.of(finder.find());
        } catch (NoResultException ex) {
            return Optional.empty();
        }
    }
}

