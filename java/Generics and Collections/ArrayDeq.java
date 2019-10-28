import java.util.Deque;
import java.util.ArrayDeque;
import static java.lang.System.out;

public class ArrayDeq
{
  public static void main(String args[])
  {
    Deque<String> dq = new ArrayDeque<String>();

    dq.add("Iris");
    dq.add("Dafodill");
    dq.addFirst("Dahlia");
    dq.addLast("Daylily");
    dq.addLast("Larkspur");
    dq.add("Buttercup");

    out.println("Elements in deque: "+dq);

    out.println("Removed last element: " + dq.removeLast());

    out.println("Head of deque: "+dq.element());

    out.println("Displaying and removing last element: "+dq.pollLast());

    out.println("First element: "+dq.peek());

    out.println("Last element: "+dq.peekLast());

    out.println("Final deque: "+dq);
  }
}
