import java.util.*;
import java.util.stream.*;
class FilterMap
{
  public static void main(String args[])
  {
    List<Integer> number = Arrays.asList(2,3,4,5);

    List<Integer> square = number.stream().map(x -> x*x*x).collect(Collectors.toList());
    System.out.println(square);

    List<String> names = Arrays.asList("Dylan","is","not","a","kind","person");

    List<String> filtered = names.stream().filter(x -> x.endsWith("n")).collect(Collectors.toList());
    System.out.println(filtered);

    List<String> sorted = names.stream().sorted().collect(Collectors.toList());
    System.out.println(sorted);

    List<Integer> nos = Arrays.asList(2,3,4,5,2,3);

    Set<Integer> squaredSet = nos.stream().map(x -> x*x).collect(Collectors.toSet());
    System.out.println(squaredSet);

    List<Integer> odds = nos.stream().filter(x -> x%2!=0).collect(Collectors.toList());
    System.out.println(odds);
  }
}
