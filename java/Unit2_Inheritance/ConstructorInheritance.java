class A{
  int reg;
  String name;
  A(int reg,String name){
    System.out.println("Inside base class A.");
    this.reg = reg;
    this.name = name;
  }
}

class B extends A{
  int m;
  B(int reg,String name,int m){
    super(reg,name);
    this.m = m;
    System.out.println("Inside derived class B.");
  }
  void disp(){
    System.out.println("Reg: "+reg+" Name: "+name+" m: "+m);
  }
}

public class ConstructorInheritance{
  public static void main(String[] args) {
    B b = new B(1212,"Brian",21);
    b.disp();
  }
}
