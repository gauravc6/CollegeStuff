class Student{
  Student(String name){
    System.out.println("Constructor with only string arguement called: "+name);
  }
  Student(String name,int reg){
    System.out.println("Constructor with int and String: "+name+" "+reg);
  }
  Student(String name, int reg, double avg){
    System.out.println("Constructor with 3 arguements: "+name+" "+reg+" "+avg);
  }
  Student(int reg,double avg){
  System.out.println("Constructor with int and double arguements: "+reg+" "+avg);
  }
  Student(double avg, float wt){
    System.out.println("Constructor with double and float: "+avg+" "+wt);
  }
  Student(String name, int marks[]){
    System.out.println("Constructor with name and array: "+name+" "+marks);
  }
}
public class OverloadConstructor{
  public static void main(String[] args) {
    Student s1 = new Student("Aryan");
    Student s2 = new Student("Vera",6261);
    Student s3 = new Student("Nishq",6262,24.5);
    Student s4 = new Student(6265,64.5);
    Student s5 = new Student(28.98,28.98f);
    int marks[] = {24,28,29,30};
    Student s6 = new Student("Arya",marks);
  }
}
