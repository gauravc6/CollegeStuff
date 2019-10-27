import java.util.*;
import java.util.stream.*;

class Product
{
  int id;
  String name, category;
  float price;
  public Product(int id, String name, float price, String category)
  {
    this.id = id;
    this.name = name;
    this.category = category;
    this.price = price;
  }
}

public class ProductStream
{
  public static void main(String args[])
  {
    List<Product> products = new ArrayList<Product>();

    products.add(new Product(1,"Alienware m15",1799.99f,"Laptops"));
    products.add(new Product(2,"Corsair K100",299.99f,"Keyboards"));
    products.add(new Product(3,"ASUS fx-270",699.99f,"Motherboards"));
    products.add(new Product(4,"Razer Viper Wireless",159.99f,"Mouses"));
    products.add(new Product(5,"AMD Ryzen 9 3900x",499.99f,"Processors"));
    products.add(new Product(6,"Alienware Area 51m",3299.99f,"Laptops"));

    List<String> laptops = products.stream()
    .filter(x -> x.category=="Laptops")
    .map(x -> x.name)
    .collect(Collectors.toList());

    float totPrice = products.stream().map(x -> x.price).reduce(0.0f,(sum, price)->sum+price);

    Product max = products.stream().max((x,y) -> x.price > y.price ? 1: -1).get();

    Product min = products.stream().min((x,y) -> x.price < y.price ? -1: 1).get();

    System.out.println("Total price of all the items is: $" + totPrice);
    System.out.println("List of laptops in the list:" + laptops);
    System.out.println("Max price in the list is: $" + max.price + " of " + max.name + ".");
    System.out.println("Least price is detected in " + min.category + " category." );


  }
}
