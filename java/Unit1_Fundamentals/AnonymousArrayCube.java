public class AnonymousArrayCube{
    static void dispCube(int arr[]){
      for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]*arr[i]*arr[i]);
      }
    }
  public static void main(String[] args) {
    dispCube(new int[]{1,2,3,4});
  }
}
