class Overloading{
  public void disp(String name){
  System.out.println(name);
}

public void disp(String name, int reg){
  System.out.println(name+" "+reg);
}
public void disp(String name, int reg, int[] marks){
  System.out.println(name+" "+reg);
  System.out.println(marks);
}
public void disp(int[] marks,float[] avg){
  System.out.println(marks+" "+avg);
}
public void disp(String name, char gen){
  System.out.println(name+" "+gen);
}
public void disp(int reg, String name){
  System.out.println(reg+" "+name);
}
}

class MethodOverloading{
  public static void main(String[] args) {
    Overloading obj = new Overloading();

    obj.disp("Blitz");
    obj.disp("Hibana",2504);
    obj.disp(2506,"Thermite");
    obj.disp("Echo",2508,new int[]{1,2,3,4,5});
    obj.disp(new int[]{10,9,8,7,6},new float[]{1.2f,2.3f,3.4f,4.5f});
    obj.disp("Vigil",'M');
  }
}
