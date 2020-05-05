package javaswing;

import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Calculator {
    JTextField txt = new JTextField(25);
    
    String nd = "";
    Double so1,so2,kq;
    String tt;
    public Calculator() {
        create();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Calculator main = new Calculator();
                main.create();
            }
        });
    }

    class Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = ((JButton) e.getSource()).getText();
            if (name.equals("Close")) {
                System.exit(0);
            } else if (name.equals("Cls")) {
                nd = "";
                txt.setText("0.0");
            } else if (name.equals("Bck")) {
                String nd = txt.getText();
                if ( name.equals("")) {
                    int len = txt.getText().length();
                    txt.setText(nd.substring(0, len - 1));
                }
            } else if ("+-*/".contains(name)) {
                so1 = Double.parseDouble(txt.getText());
                nd ="";
                txt.setText("0");
                tt = name;
            }else if("0123456789".contains(name)){
                
                txt.setText(nd + name );
                nd += name;
            }
            else if (name.equals("=")) {
                if (so1 != 0 ) {
                    so2 = Double.parseDouble(txt.getText());
                    if ( tt.equals("+")) {
                        kq = so1 + so2;
                    }
                    if ( tt.equals("-")) {
                        kq = so1 - so2;
                    }
                    if ( tt.equals("*")) {
                        kq = so1 * so2;
                    }
                    if ( tt.equals("/")) {
                        kq = so1 / so2;
                    }
                }
                txt.setText(kq.toString());
            }
                
        }

    }

    public  void create() {
        String[] a = {"Cls", "Bck", "", "Close", "7", "8", "9", "/", "4", "5",
            "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
        JFrame frm = new JFrame("CALCULATOR");
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(500, 400);
        frm.setLayout(new BorderLayout());

        JPanel pn = new JPanel();
        pn.setLayout(new GridLayout(5, 4, 5, 5));
        JPanel pn1 = new JPanel();
        frm.add(txt, BorderLayout.NORTH);
        frm.add(pn1, BorderLayout.SOUTH);

        for (int i = 0; i < a.length; i++) {
            if (i == 2) {
                JLabel lb = new JLabel();
                pn.add(lb);
            } else {
                JButton btn = new JButton(a[i]);
                pn.add(btn);
                Listener ls = new Listener();
                btn.addActionListener(ls);
            }
        }
        frm.add(pn);
    }

}
