class A extends Thread{
  public void run(){
    try{Thread.sleep(1000);}
    catch(Exception e){}
      for (int i=1;i<=5 ;i++) {
      System.out.println("Out from Thread A: a = "+i);
    }
    System.out.println("Thread A exited!");
  }
}
class B extends Thread{
  public void run(){
    for (int i=1;i<=5 ;i++) {
      System.out.println("Out from Thread B: b = "+i);
      if(i>3){
        //yeild lets other thread go forth with execution
        yield();
      }
      try{Thread.sleep(1000);}
      catch(Exception e){}
    }
    System.out.println("Thread B exited!");
  }
}
class C extends Thread{
  public void run(){
    for (int i=1;i<=5 ;i++) {
      System.out.println("Out from Thread C: c = "+i);
      if(i>3){
        //stop immediately terminates thread
        stop();
      }
      try{Thread.sleep(1000);}
      catch(Exception e){}
    }
    System.out.println("Thread C exited!");
  }
}

class ThreadMethods{
  public static void main(String[] args) {
    A t1 = new A();
    B t2 = new B();
    C t3 = new C();
    System.out.println("Starting all threads: ");
    t1.start();
    t2.start();
    t3.start();
  }
}
