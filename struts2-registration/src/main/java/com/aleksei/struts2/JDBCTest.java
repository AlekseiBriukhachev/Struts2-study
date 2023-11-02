package com.aleksei.struts2;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) {
        try {
            System.out.println("Connection to database....");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_db", "bcuser", "Password02");

            System.out.println("Connection is established");


//            Statement statement = connection.createStatement();
//            int n = statement.executeUpdate("CREATE TABLE employee(id int, name varchar(30), salary int)");
//            int n = statement.executeUpdate("INSERT INTO employee values (101, 'Aleks', 1000)");
//            int n = statement.executeUpdate("UPDATE employee SET salary = 2500 WHERE id = 101");
//            int n = statement.executeUpdate("DELETE FROM employee WHERE id = 101");

//            PreparedStatement statement = connection.prepareStatement("INSERT INTO employee values (?, ?, ?)");
//            PreparedStatement statement = connection.prepareStatement("UPDATE employee SET salary = ? WHERE id = ?");
            PreparedStatement statement = connection.prepareStatement("DELETE FROM employee WHERE id = ?");
//            statement.setInt(1, 28000);
            statement.setInt(1, 101);
//            statement.setInt(3, 1500);
            int i = statement.executeUpdate();
            System.out.println("Number of rows affected: " + i);

            PreparedStatement read = connection.prepareStatement("SELECT * FROM employee");
            ResultSet resultSet = read.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("ID") +
                        " --> " + resultSet.getString("NAME") +
                        " --> " + resultSet.getInt("salary"));
            }
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
