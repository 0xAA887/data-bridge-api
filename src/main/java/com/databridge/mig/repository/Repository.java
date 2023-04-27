package com.databridge.mig.repository;


import com.databridge.mig.exception.ObjectNotFoundException;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;

/**
 * A repository interface for managing objects of type T in a database.
 * <p>
 * This interface provides methods for common database operations such as saving, deleting, and finding objects.
 *
 * @param <T> the type of object managed by this repository.
 * @author Migx3
 */
public interface Repository<T> {

    /**
     * Retrieves a list of all objects of type T from the database.
     *
     * @return a CompletableFuture that will be completed with a List of all objects of type T found in the database.
     */
    List<T> findAll();

    /**
     * Saves the specified object of type T to the database.
     *
     * @param object the object of type T to be saved in the database.
     */
    void save(T object);

    /**
     * Deletes the specified object of type T from the database.
     *
     * @param object the object of type T to be deleted from the database.
     */
    void delete(T object);

    /**
     * Searches the database for an object of type T using the specified field and value.
     *
     * @param field the name of the field in the database to search for the value.
     * @param value the value to search for in the specified field.
     * @return an object of type T that matches the specified criteria.
     * @throws ObjectNotFoundException if no object is found that matches the specified criteria.
     */
    @NotNull
    Optional<T> findOne(String field, String value);

    /**
     * Creates a new table in the database based on the specified configuration.
     * If the table already exists, this method will not create a new table.
     */
    void createTable();

    /**
     * Updates a record in the database by a given column filter name and filter value. Sets the value of a given column
     * to a new value.
     *
     * @param columnFilterName the name of the column to use as filter
     * @param columnToUpdate   the name of the column to update the value
     * @param filter           the value to use as filter
     * @param newValue         the new value to set for the column
     */
    void update(String columnFilterName, String columnToUpdate, String filter, String newValue);
}