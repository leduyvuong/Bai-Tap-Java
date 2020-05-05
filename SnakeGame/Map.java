package snakegame;


import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class Map {
    int dodai = 1;
    private JFrame map;
    JPanel panel2 = new JPanel();
    long t1;
    int b ;
    int c ;
    public static JLabel label1,label2;
//    JLabel label1 = new JLabel();
    public void createMap() {
        
        map = new JFrame(); 
        for ( int h = 0; h < 6; h++) {
            for ( int g = 0; g < 7; g++ ) {
                if ( h == 0 && g != 3 && g !=0 && g != 6) {
                    createSnake(g, h);
                }
                else if ( h ==1 && h < 3 && g == 0 && g == 6 ){
                    createSnake(h, g);
                }
            }
        }
        
        
        JPanel panel1 = new JPanel();
        
        

        panel1.setBounds(0, 0, 594, 50);
        panel1.setBackground(Color.YELLOW);
        panel1.setLayout(null);


        panel2.setBounds(0, 50, 594, 549);
        panel2.setBackground(Color.WHITE);
        panel2.setLayout(null);


        
        
        for (int i = 0; i < 23; i++) {
            for (int j = 0; j < 21; j++) {

                JLabel label1 = new JLabel();

                label1.setBounds(i*25, j*25, 25, 25);
                label1.setBackground(Color.white);
                label1.setOpaque(true);
                label1.setBorder(new LineBorder(Color.BLACK));

                panel2.add(label1);

            }
        }
        

        map.add(panel1);
        map.add(panel2);

        map.setLayout(null);
        map.setSize(594,599);
        map.setVisible(true);
        map.setLocationRelativeTo(null);
        map.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void createSnake(int b, int c) {
        
        for ( int a = 0; a < 1; a++) {
            JLabel label2 = new JLabel();
            
            label2.setBounds(b*25, c*25, 25, 25);
            label2.setBackground(Color.red);
            label2.setOpaque(true);
            panel2.add(label2);
        }

    }
    public void reColor (int b) {
       for ( int c = 0; c < 1; c++) {
            JLabel label3 = new JLabel();
            
            label2.setBounds(b*25, 0, 25, 25);
            label2.setBackground(Color.white);
            label2.setOpaque(true);
            panel2.add(label3);
        } 
    }
    public void run() {
         while (true) {
            
            if ( b > 23) {
                break;
            }
            else if (System.currentTimeMillis()-t1 > 1000) {
                
                
                System.out.println(" b =" +b);
                t1 = System.currentTimeMillis();
            }
             panel2.setVisible(true);
            createMap();
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
            
        
        }  

         
        
         
         
    }
}
    

    

