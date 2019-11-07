import java.sql.*;
public class Ex2{
  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    try{
      System.out.println("Trying connection with DB...");
      conn = DriverManager.getConnection("jdbc:mysql://localhost/Registration", "root", "iseeyou");
      stmt = conn.createStatement();
      String exec = "CREATE TABLE Student (reg INTEGER not NULL, first VARCHAR(255), last VARCHAR(255), branch VARCHAR(3), year INTEGER, PRIMARY KEY (id))"
      stmt.executeUpdate(exec);
      System.out.println("New table created.");
    }
    catch(Exception e){
      e.printStackTrace();
    }
    stmt.close();
    conn.close();
    System.out.println("Exit!");
  }
}
