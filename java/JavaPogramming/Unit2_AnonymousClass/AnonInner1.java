abstract class Dog{
  abstract void resp();
  void walk(){
    System.out.println("Dog is walking!");
  }
}

class AnonInner1{
  public static void main(String[] args) {
    Dog d = new Dog(){
    void resp(){
      System.out.println("Barking.");
      }
    };
    d.resp();
    d.walk();
  }
}
