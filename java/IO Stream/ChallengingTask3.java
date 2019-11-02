import java.io.*;
import java.util.*;

public class ChallengingTask3{
  public static void main(String[] args) {
    try{
      String line="";
      int c,max;

      List<Integer> books = new ArrayList<Integer>();
      List<Integer> missing = new ArrayList<Integer>();
      List<Integer> available = new ArrayList<Integer>();
      List<Integer> issued = new ArrayList<Integer>();

      BufferedReader avail = new BufferedReader(new FileReader("Available.txt"));
      BufferedReader issue = new BufferedReader(new FileReader("Issued.txt"));
      BufferedWriter missed = new BufferedWriter(new FileWriter("Missing.txt"));

      while((line = avail.readLine())!=null){
        c = Integer.parseInt(line);
        available.add(c);
        books.add(c);
      }

      while((line = issue.readLine())!=null){
        c = Integer.parseInt(line);
        issued.add(c);
        books.add(c);
      }

      max = Collections.max(books);

      for(int i=1;i<=max;i++){
      if (books.contains(i)){
        System.out.print("");
      }else{
        missing.add(i);
      }
      }

      for(int i=0;i<missing.size();i++){
        missed.write(missing.get(i).toString());
        missed.newLine();
      }
      avail.close();
      issue.close();
      missed.close();

      System.out.println("---------------------REPORT-------------------");
      System.out.println("Available books: "+available);
      System.out.println("Issued books: "+issued);
      System.out.println("Total books: "+max);
      System.out.println("Total available books: "+available.size());
      System.out.println("Total issued books: "+issued.size());
      System.out.println("Total missing books: "+missing.size());
      System.out.println("List of missing books: "+missing);
      System.out.println("----------------------------------------------");
    }
    catch(IOException e){System.out.println("Files missing.");}
    }
  }
