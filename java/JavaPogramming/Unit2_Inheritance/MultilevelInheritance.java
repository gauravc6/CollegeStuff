class Chordata{
  void back(){
    System.out.println("I have a backbone!");
  }
}
class Tetrapoda extends Chordata{
  void legs(){
  System.out.println("I have 4 legs!");
  }
}
class Rabbit extends Tetrapoda{
  void action(){
    System.out.println("I hop around!");
  }
}

class MultilevelInheritance{
  public static void main(String[] args) {
    Rabbit r = new Rabbit();
    r.back();
    r.legs();
    r.action();
  }
}
