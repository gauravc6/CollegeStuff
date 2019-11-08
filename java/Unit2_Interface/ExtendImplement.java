class Animal{
  String name;
  Animal(String name){
    this.name = name;
    System.out.println("Name of animal is "+this.name);
  }
}
interface Dog{
  public void bark();
}

interface Puppy{
  public void sleep();
}

class BabyDog extends Animal implements Dog, Puppy
{
  BabyDog(String name){
    super(name);
    name = "Puppy " + name;
  }
  public void bark(){
    System.out.println("Puppies dont bark!");
  }
  public void sleep(){
    System.out.println("Sleep all day!");
  }
}
public class ExtendImplement{
  public static void main(String[] args) {
    Animal anim = new Animal("Jose");
    BabyDog dog = new BabyDog("Tiger");

    System.out.println("Animal is: "+anim.name);
    System.out.println("Dog is: "+dog.name);
    dog.bark();
    dog.sleep();
  }
}
