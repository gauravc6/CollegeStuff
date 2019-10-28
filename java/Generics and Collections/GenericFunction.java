public class GenericFunction
{
  public static <X> void print(X[] arr)
  {
    for(X x:arr)
    {
      System.out.println(x);
    }
    System.out.println();
  }


  public static void main(String[] args)
  {
    Integer[] intArr = {1,2,3,4,5};
    Double[] doubleArr = { 1.1, 2.1, 3.1, 4.1,5.1 };
    Character[] charArr = {'W','H','O','S','E','?'};
    String[] strArr = {"There","you","are"};
    print(intArr);
    print(doubleArr);
    print(charArr);
    print(strArr);
  }
}
