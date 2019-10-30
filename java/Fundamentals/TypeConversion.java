public class TypeConversion{
  public static void main(String[] args) {
    double d = 3.14;
    //lossy requires explicit type casting
    long l = (long)d;
    int i = (int)l;
    char c = (char)i;

    int m = 18;
    //non-lossy so doesnt require explicit type
    long n = m;

    System.out.println("Double Value: "+d);
    System.out.println("Long value: "+l);
    System.out.println("Int value "+i);
    System.out.println("Char Value: "+c);

    System.out.println("2nd Int Value: "+m);
    System.out.println("2nd Long value:"+n);
  }
}
