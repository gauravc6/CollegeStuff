import java.util.*;

class generic1
{
  public static <T> void Duplicate_Count(T [] arr)
  {
    Character[] new_arr = arr.toCharArray(arr);
    Map<Character, Integer> map = new HashMap<Character, Integer>();

    for(Character s: new_arr)
    {
      Integer c = map.get(s);
      if(c==null)
      {
      map.put(s,1);
    } else {
      map.put(s,c++);
    }

    }

    System.out.println(map);

  }
}

class inClass1 extends generic1
{
  public static void main(String args[])
  {
    Integer[] int_arr = {1,2,3,4,5};
    Character[] str_arr = {'a','b','c','d'};
    Duplicate_Count(int_arr);
    Duplicate_Count(str_arr);
  }
}
