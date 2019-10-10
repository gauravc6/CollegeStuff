import java.util.*;
class HashMap1
{
  public static void main(String args[])
  {
    Map<Integer, String> map = new HashMap<Integer, String>();
    map.put(401,"Unauthorized");
    map.put(403,"Forbidden");
    map.put(404,"Not found");

    System.out.println(map);
    for(Map.Entry m:map.entrySet())
    {
			System.out.println(m.getKey()+" "+m.getValue());
		}
  }
}
