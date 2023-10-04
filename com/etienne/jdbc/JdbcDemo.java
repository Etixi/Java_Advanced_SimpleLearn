package com.etienne.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo {

    public static void main(String[] args) {
        //String url = "jdbc:mysql://localhost:3306/test";
        //root@127.0.0.1:3306
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&verifyServerCertificate=false&serverTimezone=UTC";
        String username = "root";
        String password = "CaXXXXXXXX";

        int rollno = 2;
        String name = "Jane";
        int age = 22;

        String sql = "INSERT INTO student(rollno, name, age) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, rollno);
            ps.setString(2, name);
            ps.setInt(3, age);

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Inserted successfully : " + sql);
            } else {
                System.out.println("Insertion failed");
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
