class Multi implements Runnable{
  public void run(){
    try{
      System.out.println("Thread "+Thread.currentThread().getId()
      +" is runnning with priority: "+Thread.currentThread().getPriority());
    }
    catch(Exception e){
      System.out.println("Caught exception: "+e);
    }
  }
}
public class MultithreadImplement{
  public static void main(String[] args) {
    for (int i=0;i<10 ;i++ ) {
    Thread obj = new Thread(new Multi());
    obj.start();
    }
  }
}
