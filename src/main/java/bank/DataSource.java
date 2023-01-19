package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {

  // this class will connect to our database. It will read and write
  public static Connection connect() {

    // declare our path for a databse
    String dbFile = "jdbc:sqlite:resources/bank.db";

    // Declare connection object using a try block to handle exception
    Connection connection = null;
    try {
      connection = DriverManager.getConnection(dbFile);
      System.out.println("We're connected");

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return connection;

  }

  public static void main(String[] args) {

    // call the connect method using connect
    connect();

  }

}
