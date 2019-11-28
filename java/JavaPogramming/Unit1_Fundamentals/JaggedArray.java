public class JaggedArray{
  public static void main(String[] args) {
    String n1 = "Montagne";
    String n2 = "Amaru";
    String n3 = "Goyo";
    String n4 = "Nomad";
    char[] a = n1.toCharArray();
    char[] b = n2.toCharArray();
    char[] c = n3.toCharArray();
    char[] d = n4.toCharArray();
    char[][] arr = new char[4][];
    arr[0] = a;
    arr[1] = b;
    arr[2] = c;
    arr[3] = d;
    for(char[]  x: arr){
    for(int i=0;i<x.length;i++){
      System.out.print(x[i]+" ");
    }
    System.out.println();
    }
  }
}
