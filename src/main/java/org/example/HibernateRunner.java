package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class HibernateRunner
{
    public static void main( String[] args ) throws SQLException {

        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5434/postgres", "users", "password");
    }
}
