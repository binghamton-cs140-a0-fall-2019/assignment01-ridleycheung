package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAddressTester {
  public static void main(String[] args) {
    StreetUSAddress addr1 = new StreetUSAddress("123 Main Street", "Apt 1B",
                                                "Binghamton", "NY", "13902");
    StreetUSAddress addr2 = new StreetUSAddress("123 Main Avenue", "",
                                                "Binghamton", "NY", "13902");
    
    System.out.println(addr1);
    System.out.println(addr2);
    
    try(var output =new PrintWriter(new FileOutputStream(
      new File("output.txt"), true /* true means append to file */))) {
      output.println("\nTESTS FOR StreetUSAddress.java:");
      
      //Copy all your lines above, add an extra "2" to every variable name
      // and replace every System.out.print or System.out.println
      // by output.print or output.println
      
      StreetUSAddress addr12 = new StreetUSAddress("123 Main Street", "Apt 1B",
                                                  "Binghamton", "NY", "13902");
      StreetUSAddress addr22 = new StreetUSAddress("123 Main Avenue", "",
                                                  "Binghamton", "NY", "13902");
      
      output.println(addr12);
      output.println(addr22);
      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
