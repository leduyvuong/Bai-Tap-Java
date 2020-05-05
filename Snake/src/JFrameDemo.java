
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
public class JFrameDemo implements ActionListener{
    private JFrame frame;
    JButton okButton, exitButton, cancelButton;
    public JFrameDemo() {
        creatAndShow();
    }

    public void creatAndShow() {
        okButton = new JButton("Ok");
        exitButton = new JButton("Exit");
        cancelButton = new JButton("Cancel");
        frame = new JFrame("Tittle");
        frame.setSize(300,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        
        frame.add(okButton);
        okButton.setActionCommand("OK");
        okButton.addActionListener(this);
        frame.add(exitButton);
        exitButton.setActionCommand("Exit");
        exitButton.addActionListener(this);
        frame.add(cancelButton);
        cancelButton.setActionCommand("Cancel");
        cancelButton.addActionListener(this);
        
        
    }
    public static void main(String[] args) {
        new JFrameDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("OK".equals(e.getActionCommand()))
            JOptionPane.showMessageDialog(frame, "OK");
        if ("Exit".equals(e.getActionCommand()))
            System.exit(0);
        if ("Cancel".equals(e.getActionCommand()))
            JOptionPane.showConfirmDialog(frame, "Cancel");
    }
}
