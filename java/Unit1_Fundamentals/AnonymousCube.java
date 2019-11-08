class AnonymousCube
{
  void cube(double n)
  {
    System.out.println("Cube of the number is: "+n*n*n);
  }
  public static void main(String[] args) {
    new AnonymousCube().cube(3.14);
  }
}
