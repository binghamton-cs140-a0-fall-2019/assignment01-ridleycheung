package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PlaceDOBTester {
  public static void main(String[] args) {
    DateAndPlaceOfBirth dob1 = new DateAndPlaceOfBirth(1999,1,20, "New York",
                                                       "NY", "USA");
    DateAndPlaceOfBirth dob2 = new DateAndPlaceOfBirth(1999,1,20, "Los Angeles",
                                                       "CA", "USA");
    DateAndPlaceOfBirth dob3 = new DateAndPlaceOfBirth(2000,1,20, "New York",
                                                       "NY", "USA");
    DateAndPlaceOfBirth dob4 = new DateAndPlaceOfBirth(1997,8,31, "London",
                                                       "England");
    DateAndPlaceOfBirth dob5 = new DateAndPlaceOfBirth(1998,11,06, "Paris",
                                                       "France");
    System.out.println(dob1);
    System.out.println(dob2);
    System.out.println(dob3);
    System.out.println(dob4);
    System.out.println(dob5);
    
    System.out.println(dob1.hasSameBirthDayAs(dob2));
    System.out.println(dob2.hasSameBirthDayAs(dob3));
    System.out.println(dob3.hasSameBirthDayAs(dob4));
    System.out.println(dob4.hasSameBirthDayAs(dob5));
    System.out.println(dob5.hasSameBirthDayAs(dob1));
    
    System.out.println(dob1.hasSameBirthDateAs(dob2));
    System.out.println(dob2.hasSameBirthDateAs(dob3));
    System.out.println(dob3.hasSameBirthDateAs(dob4));
    System.out.println(dob4.hasSameBirthDateAs(dob5));
    System.out.println(dob5.hasSameBirthDateAs(dob1));
    
    System.out.println(dob1.olderThan(dob2));
    System.out.println(dob2.olderThan(dob3));
    System.out.println(dob3.olderThan(dob4));
    System.out.println(dob4.olderThan(dob5));
    System.out.println(dob5.olderThan(dob1));
    
    System.out.println(dob1.youngerThan(dob2));
    System.out.println(dob2.youngerThan(dob3));
    System.out.println(dob3.youngerThan(dob4));
    System.out.println(dob4.youngerThan(dob5));
    System.out.println(dob5.youngerThan(dob1));
    
    try(var output =new PrintWriter(new FileOutputStream(
      new File("output.txt"), true /* true means append to file */))) {
        output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");
      
      //Copy all your lines above, add an extra "2" to every variable name
      // and replace every System.out.print or System.out.println
      // by output.print or output.println
      
      DateAndPlaceOfBirth dob12 = new DateAndPlaceOfBirth(1999,1,20, "New York",
                                                         "NY", "USA");
      DateAndPlaceOfBirth dob22 = new DateAndPlaceOfBirth(1999,1,20, "Los Angeles",
                                                         "CA", "USA");
      DateAndPlaceOfBirth dob32 = new DateAndPlaceOfBirth(2000,1,20, "New York",
                                                         "NY", "USA");
      DateAndPlaceOfBirth dob42 = new DateAndPlaceOfBirth(1997,8,31, "London",
                                                         "England");
      DateAndPlaceOfBirth dob52 = new DateAndPlaceOfBirth(1998,11,06, "Paris",
                                                         "France");
      output.println(dob12);
      output.println(dob22);
      output.println(dob32);
      output.println(dob42);
      output.println(dob52);
      
      output.println(dob12.hasSameBirthDayAs(dob22));
      output.println(dob22.hasSameBirthDayAs(dob32));
      output.println(dob32.hasSameBirthDayAs(dob42));
      output.println(dob42.hasSameBirthDayAs(dob52));
      output.println(dob52.hasSameBirthDayAs(dob12));
      
      output.println(dob12.hasSameBirthDateAs(dob22));
      output.println(dob22.hasSameBirthDateAs(dob32));
      output.println(dob32.hasSameBirthDateAs(dob42));
      output.println(dob42.hasSameBirthDateAs(dob52));
      output.println(dob52.hasSameBirthDateAs(dob12));
      
      output.println(dob12.olderThan(dob22));
      output.println(dob22.olderThan(dob32));
      output.println(dob32.olderThan(dob42));
      output.println(dob42.olderThan(dob52));
      output.println(dob52.olderThan(dob12));
      
      output.println(dob12.youngerThan(dob22));
      output.println(dob22.youngerThan(dob32));
      output.println(dob32.youngerThan(dob42));
      output.println(dob42.youngerThan(dob52));
      output.println(dob52.youngerThan(dob12));
      
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
