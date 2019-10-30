public class BreakEx
{
  public static void main(String[] args) {
    int c = 0;
    ff:
    for(int i=0;i<10;i++)
    {
      gg:
      for (int j=0;j<5 ;j++ ) {
        if(j==3&&i==7)
        {
          break ff;
        }
        else{
          c++;
        }
        System.out.println(i+" "+j);
      }
    }
System.out.println("Loop exit!");
System.out.println(c);
  }
}
