class Test<T, U, R>
{
  T obj1;
  U obj2;
  R obj3;

  Test(T obj1, U obj2, R obj3)
  {
    this.obj1 = obj1;
    this.obj2 = obj2;
    this.obj3 = obj3;
  }

  public void disp()
  {
  System.out.println(obj1);
  System.out.println(obj2);
  System.out.println(obj3);
  }
}

class ParamGeneric
{
  public static void main(String args[])
  {
    Test <String, Integer, Float> obj = new Test<>("Radium",25,1.41f);
    obj.disp();
  }
}
