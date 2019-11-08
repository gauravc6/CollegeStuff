import java.util.*;

class Student{
  int reg;
  String name;
  Student(int reg,String name){
    this.reg = reg;
    this.name = name;
  }
}
class TreeMapEx{
  public static void main(String[] args) {
    Map<Integer,Student> students = new TreeMap<Integer,Student>();

    Student s1 = new Student(6162,"Marius");
    Student s2 = new Student(6163,"Mira");
    Student s3 = new Student(6164,"Echo");

    students.put(3,s3);
    students.put(1,s1);
    students.put(2,s2);

    for(Map.Entry<Integer,Student> x: students.entrySet()){
      int key = x.getKey();
      Student s = x.getValue();
      System.out.println(key+"Student: ");
      System.out.println(b.reg+" "+b.name);
    }
  }
}
