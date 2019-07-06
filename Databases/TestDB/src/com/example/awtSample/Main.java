package com.example.awtSample;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/azaidi/git/jave-practice-question/Databases/TestDB/testJava.db");
            //conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts"+" (name TEXT, phone INTEGER, email TEXT)" );
           // statement.execute("INSERT INTO contacts (name, phone, email)" + "VALUES('Qasim', 45565767,'qasim@email.com')");

            statement.execute("UPDATE contacts SET phone=123233 WHERE name='Tim'");


//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();
//            while(results.next()) {
//                System.out.println(results.getString("name") + " " +
//                        results.getInt("phone") + " " +
//                        results.getString("email"));
//            }


            statement.close();
            conn.close();
        } catch (SQLException e){
            System.out.println("Something went Wrong: "+e.getMessage());
        }
    }
}
