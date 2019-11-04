import java.util.*;
import static java.lang.System.out;

public class VectorEx
{
  public static void main(String[] args)
  {
    Vector<String> vec = new Vector<String>(5);

    vec.add("Jesse");
    vec.add("Cave");
    vec.add("Chell");
    vec.add("Doug");
    vec.add("P-body");

    out.println("Size of the vector is: "+vec.size());
    out.println("Default capacity of the vector: "+vec.capacity());
    out.println("The current vector is: "+vec);

    vec.add("ATLAS");
    vec.add("Carolina");
    vec.add("Morgan");

    out.println("Vector size after new additions: "+vec.size());
    out.println("Vector size after element addition is: "+vec);

    if(vec.contains("ATLAS"))
    {
      out.println("ATLAS is present at index "+vec.indexOf("ATLAS"));
    }
    else
    {
      out.println("ATLAS is not present in the list.");
    }
    out.println(vec.firstElement()+" is the first element of the vector.");
    out.println(vec.lastElement()+" is the last element of the vector.");
    }
}
