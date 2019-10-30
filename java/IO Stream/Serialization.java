import java.io.*;

class Student implements Serializable
{
  private static final long serialverUID = 8289882L;
  transient int sess;
  static int dep;
  String name;
  int reg;

  public Student(String name, int reg, int dep, int sess)
  {
    this.name =  name;
    this.reg = reg;
    this.dep = dep;
    this.sess = sess;
  }
}

public class Serialization
{
  public static void disp(Student obj)
  {
    System.out.println("Name: "+obj.name);
    System.out.println("Registration number: "+obj.reg);
    System.out.println("Department: "+ obj.dep);
    System.out.println("Session: "+obj.sess);
  }

  public static void main(String args[])
  {
    Student obj = new Student("Riya",18109,2,44);
    String fname = "test.txt";

    try
    {
      FileOutputStream file = new FileOutputStream(fname);
      ObjectOutputStream out = new ObjectOutputStream(file);

      out.writeObject(obj);
      out.close();
      file.close();
      System.out.println("Object serialized and stored. Data before serialization:");
      disp(obj);

    }
    catch(IOException e)
    {
      System.out.println("IOexception caught!");
    }
    obj = null;

    try
    {
      FileInputStream file = new FileInputStream(fname);
      ObjectInputStream in = new ObjectInputStream(file);

      obj = (Student)in.readObject();

      in.close();
      file.close();
      System.out.println("Object after deserialization:");
      disp(obj);
    }
    catch(IOException e)
    {
      System.out.println("IOEception caught!");
    }
    catch(ClassNotFoundException e)
    {
      System.out.println("ClassNotFoundException caught!");
    }
  }
}
