import java.util.*;

class Mouse implements Comparable<Mouse>{
  int launch_year;
  String name;
  double cost;
  public int compareTo(Mouse m){
    return this.launch_year - m.launch_year;
  }
  public Mouse(int launch_year,String name, double cost){
    this.launch_year = launch_year;
    this.name = name;
    this.cost = cost;
  }
  public String getName(){return name;}
  public double getCost(){return cost;}
}

class CostCompare implements Comparator<Mouse>{
  public int compare(Mouse m1, Mouse m2) {
    if(m1.getCost() > m2.getCost()) return -1;
    if(m1.getCost() < m2.getCost()) return 1;
    else return 0;
  }
}

class ComparatorEx{
  public static void main(String[] args) {
    {
      ArrayList<Mouse> mouse = new ArrayList<Mouse>();
      mouse.add(new Mouse(2012,"Razer DeathAdder Elite",99.99));
      mouse.add(new Mouse(2014,"Logitech G Pro",149.99));
      mouse.add(new Mouse(2018,"Glorious Model O",59.99));
      mouse.add(new Mouse(2016,"Razer Naga",109.99));

      CostCompare costCompare = new CostCompare();
      Collections.sort(mouse,costCompare);
      System.out.println("Sorting by cost...");
      for(Mouse m: mouse){
        System.out.println(m.getName()+" $"+m.getCost());
      }
    }
  }
}
