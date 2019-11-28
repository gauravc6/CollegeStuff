class Transfer{
  void get(){
    System.out.println("Getting...");
  }
  interface Send{
  void set();
  }
}
interface Take{
  interface Send{
    void set();
  }
}

class NestedInterface implements Transfer.Send, Take.Send{
  public void set(){
    System.out.println("Value is set!");
  }

  public static void main(String[] args) {
    Transfer.Send send = new NestedInterface();
    Take.Send send1 = new NestedInterface();
    send.set();
    send1.set();
    }
}
