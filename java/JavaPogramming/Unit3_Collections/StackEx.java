import java.util.*;

class StackEx{
  public static void main(String[] args) {
    Stack<String> anim = new Stack<>();

    anim.push("Dog");
    anim.push("Cat");
    anim.push("Horse");
    anim.push("Mouse");
    anim.push("Human");

    System.out.println("Stack is: "+anim);

    System.out.println("Popped element: "+anim.pop());
    System.out.println("Element at top of stack: "+anim.peek());
    System.out.println("Cat is present at: "+anim.search("Cat"));
    System.out.println("Is stack empty? "+anim.isEmpty());
  }
}
