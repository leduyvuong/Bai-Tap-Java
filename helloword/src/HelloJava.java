
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class HelloJava extends JFrame{
        public HelloJava(){
            JLabel label = new JLabel("Hello Java");
            this.setSize(400,400);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.add(label);
            
        }
        public static void main(String[] args) {
            
        }
        
    }
    
}
