package dev.mig.practice.api.database;

import java.sql.Connection;

/**
 * A database interface for managing database connections.
 * <p>
 * This interface provides methods for getting a database connection and closing an existing connection.
 *
 * @author Migx3
 */
public interface DatabaseProvider {

    /**
     * Retrieves a connection to the database.
     *
     * @return a Connection object representing the connection to the database.
     */
    Connection getConnection();

    /**
     * Closes an existing database connection.
     */
    void closeConnection();
}
