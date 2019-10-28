import java.util.*;
public class ArrayLists
{
public static void main(String[] args){
ArrayList<String> cars = new ArrayList<String>();
cars.add("Tulip");
cars.add("Volvo");
cars.add("Tesla");
cars.add("Beetle");
for(String str: cars)
{
  System.out.print(str+" ");
}
cars.add(2,"BMW M3");
cars.add(5,"GT610");
System.out.println();
System.out.println("List after adding: ");
for(int i=0;i<cars.size();i++)
{
  System.out.print(cars.get(i)+" ");
}
cars.remove("Volvo");
cars.remove("Tulip");
System.out.println();
System.out.println("Final List: ");
Iterator itr = cars.iterator();
while(itr.hasNext())
{
  System.out.print(itr.next()+ " ");
}
}
}
