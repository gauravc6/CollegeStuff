import java.io.*;
public class BufferedStreamCopy{
  public static void main(String[] args) {
  try{
      BufferedReader in = new BufferedReader(new FileReader("test.txt"));
      BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));

      String line = "";
      while((line=in.readLine())!=null){
        out.write(line);
        out.newLine();
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
