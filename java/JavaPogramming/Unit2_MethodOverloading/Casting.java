class Super{
  int calc(int a, int b){
    System.out.println(a*b);
    return 0;
  }
}

public class Casting extends Super{
  int calc(int a,int b){
    System.out.println(a+b);
    return 0;
  }
  
  public static void main(String[] args) {
    Super sup1 = new Casting();
    Casting down = (Casting) sup1;
    Super sup2 = (Super) new Casting();
    down.calc(2,3);
    sup2.calc(2,3);
  }
}
