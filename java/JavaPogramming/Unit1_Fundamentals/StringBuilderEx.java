public class StringBuilderEx{
  public static void main(String[] args) {
    StringBuilder c = new StringBuilder("Half");
    StringBuilder d = new StringBuilder("Half");
    StringBuilder e = new StringBuilder("Half");
    d.replace(1,4,"Life");
    System.out.println(d);
    c.replace(3,7,"Life");
    System.out.println(c);
    e.delete(2,3);
    System.out.println(e);
  }
}
