package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester {
  public static void main(String[] args) {
    DateAndPlaceOfBirth dob1 = new DateAndPlaceOfBirth(1999,1,20, "New York",
                                                       "NY", "USA");
    StreetUSAddress addr1 = new StreetUSAddress("123 Main Street", "Apt 1B",
                                                "Binghamton", "NY", "13902");
    Person per1 = new Person("John", "Smith", "123456789", dob1, addr1);
    Computer comp1 = new Computer("Dell","hello",64,128,true,99.99);
    Computer comp2 = new Computer("Apple","hello",64,256,false,199.99);
    Computer comp3 = new Computer("HP","hello",64,1280,true,149.99);
    Computer comp4 = new Computer("Toshiba","hello",64,2560,false,89.99);
    
    ComputerOwner owner1 = new ComputerOwner(per1);
    
    owner1.addComputer(comp1);
    owner1.addComputer(comp2);
    owner1.addComputer(comp3);
    owner1.addComputer(comp4);
    System.out.println(owner1);
    
    owner1.removeComputer(0);
    owner1.removeComputer(1);
    System.out.println(owner1);
    
    try(var output =new PrintWriter(new FileOutputStream(
      new File("output.txt"), true /* true means append to file */))) {
      output.println("\nTESTS FOR ComputerOwner.java:");
      
      //Copy all your lines above, add an extra "2" to every variable name
      // and replace every System.out.print or System.out.println
      // by output.print or output.println
      
      DateAndPlaceOfBirth dob12 = new DateAndPlaceOfBirth(1999,1,20, "New York",
                                                         "NY", "USA");
      StreetUSAddress addr12 = new StreetUSAddress("123 Main Street", "Apt 1B",
                                                  "Binghamton", "NY", "13902");
      Person per12 = new Person("John", "Smith", "123456789", dob12, addr12);
      Computer comp12 = new Computer("Dell","hello",64,128,true,99.99);
      Computer comp22 = new Computer("Apple","hello",64,256,false,199.99);
      Computer comp32 = new Computer("HP","hello",64,1280,true,149.99);
      Computer comp42 = new Computer("Toshiba","hello",64,2560,false,89.99);
      
      ComputerOwner owner12 = new ComputerOwner(per12);
      
      owner12.addComputer(comp12);
      owner12.addComputer(comp22);
      owner12.addComputer(comp32);
      owner12.addComputer(comp42);
      output.println(owner12);
      
      owner12.removeComputer(0);
      owner12.removeComputer(1);
      output.println(owner12);
      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
