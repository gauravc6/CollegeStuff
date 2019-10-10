import java.util.*;
class Product
{
  int id,quantity;
  double price;
  String name, seller;
  public Product(int id, String name, int quantity, String seller, double price)
  {
    this.id = id;
    this.quantity = quantity;
    this.name = name;
    this.seller = seller;
    this.price = price;
  }
}

public class LinkedHashMap1
{
  public static void main(String args[])
  {
    Map<Integer, Product> products = new LinkedHashMap<Integer, Product>();
    Product p1 = new Product(101,"K20 Keyboard",2,"Corsair",24.99);
    Product p2 = new Product(102,"G Pro Wireless",1,"Logitech",129.99);
    Product p3 = new Product(103,"Cloud Stinger Headphones",1,"HyperX",59.99);
    Product p4 = new Product(104,"Legion Y740",1,"Lenovo",1359.99);

    products.put(1,p1);
    products.put(3,p2);
    products.put(4,p3);
    products.put(2,p4);

    for(Map.Entry<Integer, Product> entry:products.entrySet())
    {
        int key = entry.getKey();
        Product p = entry.getValue();
        System.out.println(key+" Details:");
        System.out.println(p.id+" "+p.name+" "+p.seller+" "+p.quantity*p.price);
    }
  }
}
