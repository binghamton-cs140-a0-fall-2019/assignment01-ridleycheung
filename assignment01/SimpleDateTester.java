package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester {
  public static void main(String[] args) {
    SimpleDate date1 = SimpleDate.of(2000,1,1);
    SimpleDate date2 = SimpleDate.of(2000,12,31);
    SimpleDate date3 = SimpleDate.of(2005,1,1);
    SimpleDate date4 = SimpleDate.of(2004,12,31);
    
    System.out.println(date1.before(date2));
    System.out.println(date2.before(date3));
    System.out.println(date3.before(date4));
    System.out.println(date4.before(date1));
    
    try(var output =new PrintWriter(new FileOutputStream(
      new File("output.txt"), true /* true means append to file */))) {
      output.println("\nTESTS FOR SimpleDate:");
      
      //Copy all your lines above, add an extra "2" to every variable name
      // and replace every System.out.print or System.out.println
      // by output.print or output.println
      
      SimpleDate date12 = SimpleDate.of(2000,1,1);
      SimpleDate date22 = SimpleDate.of(2000,12,31);
      SimpleDate date32 = SimpleDate.of(2005,1,1);
      SimpleDate date42 = SimpleDate.of(2004,12,31);
      
      output.println(date12.before(date22));
      output.println(date22.before(date32));
      output.println(date32.before(date42));
      output.println(date42.before(date12));
      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
