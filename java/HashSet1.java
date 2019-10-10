import java.util.*;
class HashSet1
{
  public static void main(String args[])
  {
    Set<String> set = new HashSet<String>();
    set.add("I");
    set.add("feel");
    set.add("sleepy");
    set.add("sleepy");
    set.add("because");
    set.add("java");
    set.add("is");
    set.add("boring.");

    System.out.println(set);
  }
}
