interface Operation{
  int disp(int a,int b);
}
class LambdaEx2{
  public static void main(String[] args) {
    Operation add = (a,b)->a+b;
    Operation sub = (a,b)->a-b;
    Operation mult = (a,b)->a*b;
    Operation div = (a,b)->a/b;
    System.out.println("Nums are: 24 and 12.");
    System.out.println("Add: "+add.disp(24,12));
    System.out.println("Subtract: "+sub.disp(24,12));
    System.out.println("Multiply: "+mult.disp(24,12));
    System.out.println("Divide: "+div.disp(24,12));

  }
}
