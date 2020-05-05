/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copysnake;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Thread.sleep;

import javax.swing.JPanel;

/**
 *
 * @author Hi-XV
 */
public class GameScreen extends JPanel implements Runnable{
    Thread thread;
    static int[][] bg = new int[20][20];
    CreateSnake ran;
    
    public GameScreen() {
        ran = new CreateSnake();
        bg[10][11] = 2;
        thread = new Thread(this);
        thread.start();
    }
    private int i = 0;
    public void run() {
        while (true) {            
            i++;
            repaint();
            ran.update();
            try {
                sleep(20);
            } catch (InterruptedException ex) {            }
            
        }
    }
    public void paintBg(Graphics g) {
        g.setColor(Color.gray);
       
        for ( int i =0; i < 20; i++) {
            for ( int j = 0; j < 20; j++){
                g.fillRect(i*25+2, j*25+2, 21, 21);
                if (bg[i][j] == 2) {
                    g.setColor(Color.pink);
                    g.fillRect(i*25+2, j*25+2, 21, 21);
                    g.setColor(Color.gray);
                } 
            }
        }
    }
    public void paint(Graphics g) {
        paintBg(g);
        ran.Snake(g);
    }
}
