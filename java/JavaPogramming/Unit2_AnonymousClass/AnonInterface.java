interface Keyboard{
  void disp();
}
class AnonInterface{
  public static void main(String[] args) {
    Keyboard k = new Keyboard(){
    public void disp(){
      System.out.println("Generic keyboard");
      }
    };
    k.disp();
  }
}
