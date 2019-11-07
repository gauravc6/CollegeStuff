class VaragEx{
  public int disp(int ... args){
    System.out.println("Argument length: "+args.length);
    int tot = 1;
    System.out.println("Arguments passed are as follows: ");
    for(int x: args){
      System.out.print(x+" ");
    }
    for(int x: args){
      tot *=x;
    }
    return tot;
  }

  public void disp(int p, String ... args){
    System.out.println("Argument length: "+args.length);
    System.out.println("Arguments passed are as follows: ");
    for(String x: args){
      System.out.print(x+" ");
    }
  }
  public static void main(String[] args) {
    VaragEx v = new VaragEx();

    int multi1 = v.disp(2,4,10);
    System.out.println(multi1);

    v.disp(1,"Mozzie","Ela","IQ","Frost");
  }
}
