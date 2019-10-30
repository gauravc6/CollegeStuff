class Student{
  String name;
  int reg;
  Student(String name, int reg){
    this.name = name;
    this.reg = reg;
  }
}
public class ObjectArray{
  public static void main(String[] args) {
  String[] names = {"Atreus","Baldur","Faye"};
  int[] reg_no = {6261,6262,6263};
  Student obj[] = new Student[3];
  for(int i=0;i<=2;i++) {
    obj[i] = new Student(names[i],reg_no[i]);
  }
  System.out.println("Student data: ");
  for(int i=0;i<=2;i++) {
    System.out.println("Name: "+obj[i].name);
    System.out.println("Reg no.: "+obj[i].reg);
  }
}}
