class AnonInner2{
  public static void main(String[] args) {
    Person person = new Person(){
      public void talk(){
        System.out.println("Hello");
      }
    };
    person.talk();
  }
}

class Person{
  public void talk(){
    System.out.println("Hi");
  }
}
