import java.io.*;

/**
 *
 * @author Hi-XV
 */
public class DocFile2 {
    public static void main(String[] args) throws IOException {
       FileOutputStream os = new FileOutputStream("abc.txt");
       String s = " Heloooooooo mot hai";
       for ( int i = 0; i < s.length(); i++)
       {
           os.write(s.charAt(i));
       }
    }
}
