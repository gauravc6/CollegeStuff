abstract class Keyboard{
  abstract void light();
  abstract void key();
}

class Corsair extends Keyboard{
  void light(){
    System.out.println("Lighting is on!");
  }
  void key(){
     System.out.println("Cherry MX Blue");
  }
}
class Logitech extends Keyboard{
  void light(){
    System.out.println("Lighting is default!");
  }
  void key(){
     System.out.println("Cherry MX Brown");
  }
}

class AbstractionEx1{
  public static void main(String[] args) {
    Corsair k1 = new Corsair();
    Logitech k2 = new Logitech();
    k1.light();
    k1.key();
    k2.light();
    k2.key();
  }
}
