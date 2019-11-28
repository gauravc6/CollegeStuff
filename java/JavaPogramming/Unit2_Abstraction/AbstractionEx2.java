abstract class Mouse{
  abstract int getDPI();
}
class Logitech extends Mouse{
  int getDPI(){return 32000;}
}
class HP extends Mouse{
  int getDPI(){return 800;}
}
class Corsair extends Mouse{
  int getDPI(){return 10000;}
}
class Razer extends Mouse{
  int getDPI(){return 16000;}
}
class AbstractionEx2{
  public static void main(String[] args) {
    Mouse m = new Razer();
    System.out.println("DPI of Razer DeathAdder is: "+m.getDPI());
  }
}
