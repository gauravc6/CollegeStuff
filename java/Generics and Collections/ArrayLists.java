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
  System.out.println(str);
}
}
}
