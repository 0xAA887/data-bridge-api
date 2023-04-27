package com.databridge.mig.database;

/**
 * A database interface for managing database connections.
 * <p>
 * This interface provides methods for getting a database connection and closing an existing connection.
 *
 * @author Migx3
 */
public interface DatabaseProvider {

    /**
     * Creates a connection to the database.
     *
     */
    void getConnection();

    /**
     * Closes an existing database connection.
     */
    void closeConnection();
}