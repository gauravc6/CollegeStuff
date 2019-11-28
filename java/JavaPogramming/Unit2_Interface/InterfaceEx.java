interface Animal{
  void resp();
  static void walk(){
    System.out.println("Walking.");
  }
}
class Dog implements Animal{
  public void resp(){
    System.out.println("Woof!");
  }
  }

class InterfaceEx{
  public static void main(String[] args) {
    Animal anim = new Dog();
    anim.resp();
    Animal.walk();
  }
}
