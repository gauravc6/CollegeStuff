interface Display{
  public String disp();
}
class LambdaEx1{
  public static void main(String[] args) {
    Display d=()->{
      return "We rise up from the dust!";
    };
    System.out.println(d.disp());
  }
}
