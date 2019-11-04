public class GenericAdd {

    static <T> T add(T x, T y){
      Double sum = 0.0;
      double e1 = (Double) (x);
      double e2 = (Double) (y);
      sum = e1 + e2;
      return ((T) sum);
    }
    public static void main(String args[])
    {
      double x = 2.1;
      double y = 3.2;
      double sum = (Double) (add(x, y));
      System.out.println("Sum="+sum);
    }
}
