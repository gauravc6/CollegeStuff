import java.util.*;

class TreeSetEx{
  public static void main(String[] args) {
    SortedSet<Integer> linked = new TreeSet<Integer>();
    linked.addAll(Arrays.asList(new Integer[]{1,2,3,4,3,25,4,43,4,3}));

    System.out.println("Set is: "+linked);
    System.out.println("Size of set: "+linked.size());
    System.out.println("First: "+linked.first());
    System.out.println("Last: "+linked.last());

    SortedSet<Integer> bef = linked.headSet(3);
    System.out.println(bef);

    SortedSet<Integer> bet = linked.subSet(3,43);
    System.out.println(bet);

    SortedSet<Integer> aft = linked.tailSet(4);
    System.out.println(aft);
  }
}
