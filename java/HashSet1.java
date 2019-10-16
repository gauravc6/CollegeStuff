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

    Set<Integer> int_set = new HashSet<Integer>();
    int_set.add(1);
    int_set.add(2);
    int_set.add(2);
    int_set.add(3);

    System.out.println(set);
    System.out.println(int_set);
  }
}
