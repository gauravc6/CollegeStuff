import java.util.*;

class CustomArrayList
{
  int n=5;

  class Price
  {
    int id;
    float cost;
    String name;

    Price(int id, String name, float cost)
    {
      this.id = id;
      this.name = name;
      this.cost = cost;
    }
  }

  public static void main(String args[])
  {
    int id[] = {6260,6261,6262,6263,6264};
    float cost[] = {24.99f,29.99f,99.99f,149.99f,1349.99f};
    String name[] = {"Primary","Secondary","Tertiary","Quaternary","Quinary"};

    CustomArrayList list = new CustomArrayList();
    list.addVal(id,name,cost);
  }

  public void addVal(int id[],String name[],float cost[])
  {
    ArrayList<Price> list = new ArrayList<>();
    for(int i=0; i<n;i++)
    {
      list.add(new Price(id[i],name[i],cost[i]));
    }
    printVals(list);
  }

  public void printVals(ArrayList<Price> list)
  {
    for (int i = 0; i < n; i++)
    {
      Price price = list.get(i);
      System.out.println(price.id+" "+price.name+" "
              +price.cost);
    }
  }
}
