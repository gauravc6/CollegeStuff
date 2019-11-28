import java.sql.*;
public class Ex1{
  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    try{
      System.out.println("Trying connection with DB...");
      conn = DriverManager.getConnection("jdbc:mysql://localhost/Registration", "root", "iseeyou");
      stmt = conn.createStatement();
      stmt.executeUpdate("INSERT INTO Student VALUES (6261, 'Walter', 'White', 'BCE', 2)");
      stmt.executeUpdate("INSERT INTO Student VALUES (1822, 'Flynn', 'White', 'BCE', 3)");
      System.out.println("Records inserted!");
    }
    catch(Exception e){
      e.printStackTrace();
    }
    stmt.close();
    conn.close();
    System.out.println("Exit!");
  }
}
