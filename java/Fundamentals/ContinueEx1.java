public class ContinueEx1{
  public static void main(String[] args) {
    for (int i=0;i<=5 ;i++ ) {
      if(i==3)
      {
      System.out.println("Condition hit. Statement skipped.");
      continue;
      }
      System.out.println(i);
    }
  }
}
