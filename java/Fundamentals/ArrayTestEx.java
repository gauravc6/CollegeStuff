public class ArrayTestEx{
  static void max(int arr[]){
    int max=arr[0];
    for (int i=0;i<arr.length ;i++ ) {
      if(max<arr[i])
      {
        max=arr[i];
      }
    }
    System.out.println("Max in the array is: "+max);
  }
      public static void main(String[] args) {
        int a[] = {3,4,5,2,3,4,8};
        max(a);
      }
}
