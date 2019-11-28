class Mouse{
  void setDPI(){
    System.out.println("DPI set to 800.");
  }
}

class Corsair extends Mouse{
  void resp(){
    System.out.println("Polling rate: 10000");
  }
}

class Logitech extends Mouse{
  void flick(){
    System.out.println("Sens: 2");
  }
}

class HierarchicalInheritance{
  public static void main(String[] args) {
    Logitech l = new Logitech();
    l.flick();
    l.setDPI();

    Corsair c = new Corsair();
    c.setDPI();
    c.resp();
  }
}
