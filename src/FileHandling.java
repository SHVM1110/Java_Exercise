import java.io.*;
import java.util.*;
public class FileHandling
{
  public static void main(String args[]) throws IOException {
      String path="./file handling.txt";
      File f = new File(path);
      FileWriter fw = new FileWriter(f);
      if(!f.exists())
      {
          f.createNewFile();
      }
      fw.write("Hello! there");
      fw.write("\nHow you doing ?");
      fw.write("\nHope you've a great day!");
      fw.close();

      FileReader fr = new FileReader(path);
      BufferedReader br = new BufferedReader(fr);
      String s;
      while((s=br.readLine())!=null)
      {
          System.out.println(s);
      }



  }
}
