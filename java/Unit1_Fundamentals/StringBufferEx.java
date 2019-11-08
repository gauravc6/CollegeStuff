public class StringBufferEx{
  public static void main(String[] args) {
    StringBuffer a = new StringBuffer("Half");
    StringBuffer b = new StringBuffer("Half");
    StringBuffer c = new StringBuffer("Half");
    a.append("Life");
    System.out.println(a);
    b.insert(1,"Life");
    System.out.println(b);
    c.insert(2,"Life");
    System.out.println(c);
  }
}
