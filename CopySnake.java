/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copysnake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author Hi-XV
 */
public class CopySnake extends JFrame {
    
    GameScreen game;
    
    public CopySnake() {
        
        setSize(550,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game = new GameScreen();
        add(game);
        this.addKeyListener(new mover());
        setVisible(true);
        
    }
    
    public static void main(String[] args) {

        CopySnake f = new CopySnake();
        
        
    }
    public class mover implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {}

        @Override
        public void keyPressed(KeyEvent e) {
            if ( e.getKeyCode() == KeyEvent.VK_UP) {
                game.ran.setVector(CreateSnake.Go_UP);
            }
            if ( e.getKeyCode() == KeyEvent.VK_DOWN) {
                game.ran.setVector(CreateSnake.Go_DOWN);
            }
            if ( e.getKeyCode() == KeyEvent.VK_LEFT) {
                game.ran.setVector(CreateSnake.Go_LEFT);
            }
            if ( e.getKeyCode() == KeyEvent.VK_RIGHT) {
                game.ran.setVector(CreateSnake.Go_RIGHT);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {}
        
    }
    
}
