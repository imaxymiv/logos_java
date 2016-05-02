package com.test14.www;

import com.mysql.jdbc.Driver;


import java.sql.*;

/**
 * Created by Ivan on 4/28/2016.
 */
public class Test14 {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/world?autoReconnect=true&useSSL=false";

    // Database credentials
    static final String USER = "root";
    static final String PASS = "1111";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
//            PreparedStatement statement=connection.prepareStatement("select * from city");
//            ResultSet resultSet=statement.executeQuery();
//
//            while (resultSet.next()){
//                for (int i =1; i<=resultSet.getMetaData().getColumnCount();i++){
//                    System.out.print(resultSet.getString(i) + " ");
//                }
//                System.out.println();
//
//
//            }


//        PreparedStatement statement2 = connection.prepareStatement("insert into country(name) value('donetsk')");
//        statement2.executeUpdate();

//        PreparedStatement statement3 = connection.prepareStatement("select * from country where population > ? or population>?");
//        statement3.setInt(1, 1040000);
//        statement3.setInt(2, 1200000);
//        ResultSet resultSet = statement3.executeQuery();
//        //ResultSet resultSet2 = statement3.getResultSet();
//
//        while (resultSet.next()) {
//            for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
//                System.out.print(resultSet.getString(i) + " ");
//            }
//            System.out.println();
//
//
//        }





        CallableStatement callableStatement = connection.prepareCall("call p1()");
        ResultSet resultSet = callableStatement.executeQuery();

        while (resultSet.next()){

            for (int i =1; i<=resultSet.getMetaData().getColumnCount();i++){
                System.out.print(resultSet.getString(i) + " ");
            }
            System.out.println();
        }




        connection.close();
    }
}
