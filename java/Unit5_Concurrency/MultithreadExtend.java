class Multi extends Thread{
  public void run(){
    try{
      System.out.println("Thread "+Thread.currentThread().getId()+" is running with name: "
      +Thread.currentThread().getName());
    }
    catch(Exception e){
      System.out.println("Caught exception: "+e);
    }
  }
}
public class MultithreadExtend{
  public static void main(String[] args) {
    for (int i=0;i<10 ;i++ ) {  
    Multi obj = new Multi();
    obj.start();
    }
  }
}
