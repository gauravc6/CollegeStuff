import java.util.*;
import static java.lang.System.out;

public class PriorityQueueEx
{
  public static void main(String args[])
  {
    PriorityQueue<String> names = new PriorityQueue<String>(15, new MyComp());
    names.add("Kratos");
    names.add("Atrues");
    names.add("Baldur");
    names.add("Magni");
    names.add("Modi");
    names.add("Brock");
    names.add("Sindri");

    out.println("Head: "+ names.peek());
    out.println("Queue sorted by string lenght: ");
    Iterator itr = names.iterator();
    while(itr.hasNext())
    {
      out.println(itr.next());
    }
    //remove elements code
    // names.poll();
    // names.pollLast();

    }
  }
  class MyComp implements Comparator<String>
  {
    @Override
    public int compare(String x, String y)
    {
      return x.length() - y.length();
    }
}
