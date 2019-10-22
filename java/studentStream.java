import java.util.*;
import java.util.stream.*;

class Student
{
  int id;
  String name,branch;

  public Student(int id, String name, String branch)
  {
    this.id = id;
    this.name = name;
    this.branch = branch;
  }

  public int getId()
  {
    return id;
  }
  public String getName()
  {
    return name;
  }
  public String getBranch()
  {
    return branch;
  }
}

class studentStream
{
  public static void main(String args[])
  {
    List<Student> students = new ArrayList<Student>();
    students.add(new Student(6261,"Dylan","BOE"));
    students.add(new Student(6262,"Jesse","BME"));
    students.add(new Student(6263,"Evan","BCE"));
    students.add(new Student(6264,"Elliot","BEC"));
    students.add(new Student(6265,"Pajeet","BAI"));
    students.add(new Student(6266,"Tyrone","BAE"));

    students.stream().filter(x -> x.getName().matches("Jesse"))
    .findFirst()
    .ifPresent(System.out::println);
  }
}
