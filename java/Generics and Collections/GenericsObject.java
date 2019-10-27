class gen<U, V>
{
    U obj1;
    V obj2;

    gen(U obj1, V obj2)
    {
      this.obj1 = obj1;
      this.obj2 = obj2;
    }

    public void print()
    {
      System.out.println(obj1);
      System.out.println(obj2);
    }
}

class GenericsObject
{
  public static void main(String args[])
  {
    gen <String, Integer> obj1 = new gen<String, Integer>("Joe",250);
    gen <Float, String> obj2 = new gen<Float, String>(25.25f,"Sam");
    obj1.print();
    obj2.print();
  }
}
