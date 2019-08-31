package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester {
  public static void main(String[] args) {
    DateAndPlaceOfBirth dob1 = new DateAndPlaceOfBirth(1999,1,20, "New York",
                                                       "NY", "USA");
    StreetUSAddress addr1 = new StreetUSAddress("123 Main Street", "Apt 1B",
                                                "Binghamton", "NY", "13902");
    Person per1 = new Person("John", "Smith", "123456789", dob1, addr1);
    
    System.out.println(per1);
    
    try(var output =new PrintWriter(new FileOutputStream(
      new File("output.txt"), true /* true means append to file */))) {
      output.println("\nTESTS FOR Person.java:");
      
      //Copy all your lines above, add an extra "2" to every variable name
      // and replace every System.out.print or System.out.println
      // by output.print or output.println
      
      DateAndPlaceOfBirth dob12 = new DateAndPlaceOfBirth(1999,1,20, "New York",
                                                         "NY", "USA");
      StreetUSAddress addr12 = new StreetUSAddress("123 Main Street", "Apt 1B",
                                                  "Binghamton", "NY", "13902");
      Person per12 = new Person("John", "Smith", "123456789", dob12, addr12);
      
      output.println(per12);
      
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
