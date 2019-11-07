import java.sql.*;
public class Ex1{
  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    try{
      System.out.println("Trying connection with DB...");
      conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "iseeyou");
      System.out.println("Initiating db creation...");
      stmt = conn.createStatement();
      stmt.executeUpdate("CREATE DATABASE Registration");
      System.out.println("DB created!");
    }
    catch(Exception e){
      e.printStackTrace();
    }
    stmt.close();
    conn.close();
    System.out.println("Exit!");
  }
}
