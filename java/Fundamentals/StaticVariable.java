class Emp{
  String name,dep;
  int empid;
  static String institution = "FBC";
  static int index = 0;
  static int n_emps = 0;

  Emp(int empid, String name, String dep){
    n_emps++;
    this.empid = empid;
    this.name = name;
    this.dep = dep;
  }
  void disp(){
    index++;
    System.out.println("Employee: "+index+"/"+n_emps);
    System.out.println(empid+" "+name+" "+dep+" "+institution);
  }
}
public class StaticVariable{
  public static void main(String[] args) {
    Emp e1 = new Emp(6261,"Ela","CSE");
    Emp e2 = new Emp(6262,"Vigil","ECE");
    Emp e3 = new Emp(6263,"Blackbeard","MEC");

    e1.disp();
    e2.disp();
    e3.disp();

  }
}
