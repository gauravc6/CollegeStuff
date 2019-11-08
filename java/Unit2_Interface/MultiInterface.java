interface Test{
  void disp();
  default void show(){
    System.out.println("From Test class");
  }
}
interface Result{
  void dep();
  default void show2(){
    System.out.println("From Result class");
  }
}
interface Final extends Test, Result{
  void dink();
}

class MultiInterface implements Final{
  public void dink(){
    System.out.println("Dinked");
  }
  public void dep(){
    System.out.println("Deployed");
  }
  public void disp(){
    System.out.println("Displayed");
    }
    public static void main(String[] args) {
      MultiInterface obj = new MultiInterface();

      obj.dink();
      obj.dep();
      obj.disp();
      obj.show();
  }
}
