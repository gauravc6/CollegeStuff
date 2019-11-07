class Keyboard{
  double getCost(){return 0;}
}
class Corsair extends Keyboard{
  double getCost(){return 149.99;}
}
class Logitech extends Keyboard{
  double getCost(){return 99.99;}
}
class Razer extends Keyboard{
  double getCost(){return 179.99;}
}

class Overriding{
  public static void main(String[] args) {
    Keyboard k;
    k = new Corsair();
    System.out.println("Corsair: $"+k.getCost());
    k = new Razer();
    System.out.println("Razer: $"+k.getCost());
    k = new Logitech();
    System.out.println("Logitech: $"+k.getCost());
  }
}
