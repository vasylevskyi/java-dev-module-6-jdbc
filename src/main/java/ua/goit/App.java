package ua.goit;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws SQLException {

        Connection connection = Database.getInstance().getConnection();

        Statement statement = connection.createStatement();

        statement.executeUpdate("CREATE TABLE test_table (name VARCHAR(100))");

        statement.close();

        connection.close();

    }
}
