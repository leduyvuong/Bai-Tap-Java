
;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class BanCo {
    private JFrame banco;
    JButton btn,btn2,btn3,btn4;
    public BanCo() {
        taoBanCo();
    }

    public void taoBanCo() {
        banco = new JFrame("A");
        btn = new JButton("3");
        
        btn.setBounds(50 , 50, 100, 100);
        
        banco.add(btn);
        
        banco.setSize(500,500);
        banco.setLayout(null);
        banco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        banco.setLocationRelativeTo(null);
        banco.setVisible(true);
        
    }
    public static void main(String[] args) {
        new BanCo();
    }
    
}
