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

class UpCast{
  public static void main(String[] args) {

    SQLite lite = new SQLite();
    SQL sql = (SQL) lite;

    Server serv = new MySQL();
    sql.active();
    serv.active();
  }
}
