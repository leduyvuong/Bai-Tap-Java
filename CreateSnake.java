/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copysnake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

/**
 *
 * @author Hi-XV
 */
public class CreateSnake {
    int dodai = 3;
    int[] x;
    int[] y;
    long t = 0;
    public static int Go_UP = 1;
    public static int Go_DOWN = -1;
    public static int Go_LEFT = 2;
    public static int Go_RIGHT = -2;
    
    int vector = CreateSnake.Go_DOWN;
    public CreateSnake() {
        x = new int[20];
        y = new int[20];
        
        
        x[0] = 5;
        y[0] = 4;
        x[1] = 5;
        y[1] = 3;
    }
    public void setVector (int v) {
        if (vector != -v)
        vector = v;
    }
    public boolean toaDoThanRan(int x1, int y1) {
        for ( int i = 0; i < dodai; i++) {
            if ( x[i] == x1 && y[i] == y1) return true;
            
        }
        return false;
    }
    public Point newMoi() {
        Random r = new Random();
        int x;
        int y;
        do {
            x = r.nextInt(19);
            y = r.nextInt(19);
        } while (toaDoThanRan(x, y));
        return new Point(x,y);
    }
    public void update() {
        if (System.currentTimeMillis() - t > 200 ) {
            
            if ( GameScreen.bg[x[0]][y[0]] == 2) {
                dodai++;
                GameScreen.bg[x[0]][y[0]] = 0;
                GameScreen.bg[newMoi().x][newMoi().y] = 2;
                
            }   
            
            for( int i = dodai-1; i > 0; i--) {
                 
                x[i]=x[i-1];
                y[i]=y[i-1];
            }
            if(vector == CreateSnake.Go_UP)      y[0]--;
            if(vector == CreateSnake.Go_DOWN)    y[0]++;
            if(vector == CreateSnake.Go_LEFT)    x[0]--;
            if(vector == CreateSnake.Go_RIGHT)   x[0]++;
            t = System.currentTimeMillis();
            if ( x[0] > 19 ) x[0] = 0;
            if ( x[0] < 0 ) x[0] = 19;
            if ( y[0] > 19 ) x[0] = 0;
            if ( y[0] < 0 ) x[0] = 19;
        }
    }
    public void Snake(Graphics g) {
        g.setColor(Color.pink);
        for ( int i = 0; i < dodai; i++) {
            g.fillRect(x[i]*25+2, y[i]*25+2, 21, 21);
        }
    }

    
    
}
