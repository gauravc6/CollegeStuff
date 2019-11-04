import java.util.*;
import static java.lang.System.out;

class QueueExample1
{
  public static void main(String args[])
  {
    Queue<Float> ver = new LinkedList<>();

    ver.add(2.29f);
    ver.add(3.29f);
    ver.add(10.01f);
    ver.add(24.5f);
    ver.add(3.14f);

    out.println("Queue is: "+ver);

    out.println("Removed from queue: " +ver.remove());

    out.println("Removed from queue: "+ver.poll());

    out.println("Final queue: "+ ver);
  }
}
