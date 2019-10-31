public class OverloadMain{
  public static void main(String[] args) {
    System.out.println("Output from defualt main function.");
    System.out.println();
    OverloadMain.main("Chell",2588);
    OverloadMain.main("Mikhail","Kalishnikova");
  }
  public static void main(String name, int reg) {
    System.out.println("Hi, "+name);
    System.out.println("Your reg no. is: "+reg);
    //gets exceuted before 2nd overload of main in main(String[] main)
    OverloadMain.main("Cave","Johnson");
  }
  public static void main(String fname, String lname) {
    System.out.println("Hello, "+fname+" "+lname+"!");
    OverloadMain.main(new int[]{2,3,4,5,4});
  }
  public static void main(int[] nums) {
    for(int x: nums){
      System.out.print(x+" ");
    }
    System.out.println();
    // calling main overload of same param type causes infinite loop
    //OverloadingMain.main(new int[]{1,2,3});

    // doesnt work because it cant find the method with String param.
    // main overloading can only use its own parameterized methods
    // or the default method i.e. (String[] args)
    //OverloadingMain.main("Doug");
  }
}
