package com.icloud.bridge.java;

import java.sql.*;

public class JdbcExample {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.Driver");

        try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:~/test", "sa", "")) {
            String sql = "CREATE TABLE ACCOUNT(" +
                    "id INTEGER not null, " +
                    "email VARCHAR(255), " +
                    "password VARCHAR(255), " +
                    "PRIMARY KEY(id));";

            Statement statement = connection.createStatement();
            statement.execute(sql);
            PreparedStatement statement1 = connection.prepareStatement(sql);


            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println("resultSet = " + resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
