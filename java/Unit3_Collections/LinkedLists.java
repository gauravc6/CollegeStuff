import java.util.*;
class LinkedLists{
  public static void main(String[] args) {
    LinkedList<String> names = new LinkedList<>();

    names.add("Elon");
    names.add("Susan");
    names.add("Jack");
    names.add("Alan");
    names.add("Mark");

    System.out.println("Linked list: "+names);

    names.addFirst("Toby");
    names.addLast("Jessica");

    System.out.println("New list after additions: "+names);
    System.out.println("Size of new list: "+names.size());

    System.out.println("First element in the list: "+names.getFirst());
    names.set(0,"Felix");
    System.out.println("List after changing first element: "+names);

    names.poll();
    names.pollLast();
    System.out.println("List after polling: "+names);

    names.add(0,"Toby");
    names.removeLast();
    System.out.println("Final list: "+names);
  }
}
