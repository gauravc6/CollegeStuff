import java.util.*;
class HashMap2
{
  public static void main(String args[])
  {
    HashMap<String, Double> items = new HashMap<String, Double>();

    items.put("Tomatoes",11.50);
    items.put("Apple",10.90);
    items.put("Peach",15.60);
    items.put("Castor Oil",26.90);

    System.out.println(items);

    Set<String> itemNames = items.keySet();

    for(String item: itemNames)
    {
      System.out.println(item);
    }
  }
}
