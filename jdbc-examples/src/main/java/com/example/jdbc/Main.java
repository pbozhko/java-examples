package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private static String DATABASE_URL = "jdbc:mysql://localhost/mydb";
    private static String USER = "root";
    private static String PASSWORD = "wc6120008";

    private static Connection connection = null;
    private static Statement statement = null;

    public static void main(String... args) throws SQLException, ClassNotFoundException {

        System.out.println("Registering JDBC driver...");

        Class.forName("com.mysql.jdbc.Driver");

        System.out.println("Creating database connection...");
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

        System.out.println("Executing statement...");
        statement = connection.createStatement();

        selectAll();

        insertAll();

        selectAll();

        statement.close();
        connection.close();
    }

    private static void insertAll() throws SQLException {

        String query = "INSERT INTO t_users(name, age) VALUES ('User1', 15), ('User2', 26)";
        statement.executeUpdate(query);
    }

    private static void selectAll() throws SQLException {

        String query = "SELECT * FROM t_users";

        ResultSet resultSet = statement.executeQuery(query);

        printResultSet(resultSet);

        resultSet.close();
    }

    private static void printResultSet(ResultSet resultSet) throws SQLException {

        while (resultSet.next()) {

            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");

            System.out.println("\n================\n");
            System.out.println("id: " + id);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
}
