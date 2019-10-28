class Test<T>
{
  T obj;
  Test(T obj)
  {
    this.obj = obj;
  }
  public T getObj()
  {
    return this.obj;
  }
}

class SimpleGeneric
{
  public static void main(String args[])
  {
    Test<Integer> iobj = new Test<Integer>(10);
    System.out.println(iobj.getObj());

    Test <String> sobj = new Test<String>("Uranium");
    System.out.println(sobj.getObj());
  }
}
