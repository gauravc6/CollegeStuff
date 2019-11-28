class Keyboard{
  String name="Generic";
  void keys(){
    System.out.println("Super keyboard has 108 keys!");
  }
}

class Corsair extends Keyboard{
  String name="Corsair";
  void keys(){
    System.out.println("Inherited keyboard has 112 keys!");
  }
  void disp(){
    System.out.println("Keyboard: "+super.name);
    super.keys();
    System.out.println("Keyboard: "+name);
    keys();
  }
}

class SuperVarMethod{
  public static void main(String[] args) {
    Corsair c = new Corsair();
    //cant stack methods
    //c.super.keys();
    c.disp();
  }
}
