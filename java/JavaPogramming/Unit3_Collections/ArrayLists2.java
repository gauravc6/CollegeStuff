import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class ArrayList2{
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    List<String> names_copy = new ArrayList<>();

    names.add("Alienware");
    names.add("Corsair");
    names.add("Blizzard");
    names.add("Razer");

    Collections.copy(names_copy,names);

    names_copy.add("Razer");
    names_copy.add("Hyper-X");
    names_copy.add("Mixer");

    System.out.println("Original list:");
    System.out.println(names);
    System.out.println();

    System.out.println("Sorted new list: ");
    Collections.sort(names_copy);
    System.out.println(names_copy);
    System.out.println();

    System.out.println("Reversed list: ");
    Collections.reverse(names_copy);
    System.out.println(names_copy);
    System.out.println();

    System.out.println("Shuffled list: ");
    Collections.shuffle(names_copy);
    System.out.println(names_copy);
    System.out.println();

    System.out.println("Checking occurance of Alienware: ");
    System.out.println(Collections.frequency(names_copy,"Alienware"));
    System.out.println();

  }
}
