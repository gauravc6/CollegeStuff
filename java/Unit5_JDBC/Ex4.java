import java.sql.*;
public class Ex1{
  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    try{
      System.out.println("Trying connection with DB...");
      conn = DriverManager.getConnection("jdbc:mysql://localhost/Registration", "root", "iseeyou");
      stmt = conn.createStatement();
      stmt.executeUpdate("UPDATE Student SET year = 2 WHERE id=1822");
      ResultSet rs = stmt.executeQuery("SELECT * FROM Student");

      while (rs.next()){
        System.out.print("Reg no.: "+rs.getInt("reg"));
        System.out.print("First name: "+rs.getString("first"));
        System.out.print("Last name: "+rs.getString("last"));
        System.out.print("Branch: "+rs.getString("branch"));
        System.out.println("Year: "+rs.getInt("year"));
      }
      rs.close();
    }
    catch(Exception e){
      e.printStackTrace();
    }
    stmt.close();
    conn.close();
    System.out.println("Exit!");
  }
}
