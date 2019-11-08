public class IfElse{
  public static void main(String[] args) {
    int age=34;
    if(age>=18)
    {
      System.out.println("You are eligible to vote.");
      if(age>=18 && age<25){
        System.out.println("You are a young adult.");
      }else if(age>=25 && age<35){
        System.out.println("You are a middle aged person.");
      }else if(age>=35 && age<45){
        System.out.println("You are still active!");
      }else{
        System.out.println("You are old!");
      }
    }else if(age>0 && age<18){
      System.out.println("You are not elegible to vote.");
      if(age<10){
        System.out.println("You are a child!");
      }else{
        System.out.println("You are a teenager!");
      }
    }else{
      System.out.println("Invalid Age!");
    }
  }
}
