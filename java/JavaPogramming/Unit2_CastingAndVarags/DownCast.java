interface Server{
  public void active();

  public void idle();

  public void hibernating();
}

abstract class SQL implements Server{
  public void active(){
    System.out.println("Serving requests.");
  }
  public void idle(){
    System.out.println("Server in idle state.");
  }
  public void hibernating(){
    System.out.println("Good night!");
  }
}

class SQLite extends SQL{
  public void active(){
    System.out.println("SQLite server active.");
  }
  public void hit(){
    System.out.println("100k hits registered.");
  }
}

class MySQL extends SQL{
  public void active(){
    System.out.println("MySQL server active.");
  }
  public void hit(){
    System.out.println("500k hits registered.");
  }
}
class DownCast{
  public static void main(String[] args) {
    SQL sql = new MySQL();

    if (sql instanceof MySQL){
      MySQL sql1 = (MySQL) sql;
      sql1.hit();
    }
  }
}
