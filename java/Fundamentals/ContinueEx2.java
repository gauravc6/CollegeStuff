public class ContinueEx2
{
  public static void main(String[] args) {
    ff:
    for (int i=0;i<10 ;i++ ) {
      gg:
      for (int j=0;j<10 ;j++ ) {
        if(i%2==0&&j%3==0)
        {
          System.out.println("Statement skipped.");
          continue gg;
        }
        System.out.println(i+" "+j);
      }
    }
  }
}
