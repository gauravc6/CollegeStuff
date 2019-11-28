class Item{
  int id;
  String name;
  double price;
  int qty;
  double tot = 0.0;
  static int index = 1;
  Item(int id, String name, double price, int qty){
    this.id = id;
    this.name = name;
    this.price = price;
    this.qty = qty;
    this.tot = price * qty;
  }
  void disp(){
    System.out.println(index+" "+name+" "+price+" "+qty+" "+tot);
    index++;
  }
}

public class ShoppingCart{
  public static void main(String[] args) {
    Item a = new Item(201,"Thermal compound",20.50,2);
    Item b = new Item(632,"Heat shield",149.99,3);
    Item c = new Item(892,"RJ-45 cable",34.99,1);

    a.disp();
    b.disp();
    c.disp();
  }
}
