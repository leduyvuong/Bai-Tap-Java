/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Hi-XV
 */
public class SnakeMove {
    public void run() {
       
        Map map = new Map();
        int a =1;
        for (int i = 1; i < 24; i++) {
            map.createMap();
            JLabel label = new JLabel();
            map.label1.setBounds( 0, i*25, 25, 25);
            map.label1.setBackground(Color.red);
            map.label1.setOpaque(true);
            map.label1.setBorder(new LineBorder(Color.BLACK));
           
            
                            
            
       }
    }
//    
}
