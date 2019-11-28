class StaticBlock{
  static int store_id;
  static String name;
  static int cost1 = 20;
  static double val;
  static{
    System.out.println("1st static block!");
    store_id = 20;
    name = "Allen";
    val = cost1*store_id;
  }
  static{
    System.out.println("2nd static block!");
    store_id = 30;
    name = "Ngin";
    Double doubleStore = new Double(store_id);
    Double cost = new Double(cost1);
    val = cost/doubleStore;
  }
  public static void main(String[] args) {
    // main is static so it overwrites previous value of same variable
    //store_id = 40;
    System.out.println("Store ID: "+store_id);
    System.out.println("Name of manager: "+name);
    System.out.println("Value: "+val);
  }
}
