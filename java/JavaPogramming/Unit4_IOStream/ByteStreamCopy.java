import java.io.*;
class ByteStreamCopy{
  public static void main(String[] args) {
    byte[] b = new byte[5];
    try{
      FileInputStream in = new FileInputStream("test.txt");
      FileOutputStream out = new FileOutputStream("out.txt");

      System.out.println("Bytes available: "+in.available());
      int c;
      while((c=in.read(b))!=-1){
        out.write(b);
      }
      System.out.println("File created/updated!");
      in.close();
      out.close();
    }
    catch(IOException e){
      System.out.println("IOException caught!");
    }
  }
}
