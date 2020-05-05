import java.io.*;
import java.io.Console;
/**
 *
 * @author Hi-XV
 */
public class DocFile1 {
    public static void main(String[] args) throws IOException {
        Console c = System.console();
        System.out.println("" +c);
        System.out.println("Enter your name");
        String n = c.readLine();
        System.out.println(" Welcome " + n);
        
    }
}
