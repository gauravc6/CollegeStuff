import java.util.*;
import java.util.stream.*;
public class streamEx2
{
  public static void main(String args[])
  {
    List<Integer> list = Stream.iterate(1,ele -> ele+1)
    .filter(ele -> ele%2==0)
    .limit(10)
    .collect(Collectors.toList());
    System.out.println(list);
  }
}
