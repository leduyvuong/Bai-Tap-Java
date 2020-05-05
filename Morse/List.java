/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Hi-XV
 */
public class List implements ActionListener {

    private JLabel lbWord;
    private JLabel lbSound;
    private JLabel lbSpace;
    private JTextField txtWord;
    private JTextField txtSound;
    private JButton btnChange;
    private JButton btnChangeB;

    public List() {
        createGB();
    }

    ArrayList<Morse> list;
    private Morse A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, so1, so2, so3, so4, so5, so6, so7, so8, so9, so0;
    private JFrame gd;

    ArrayList<Morse> ds() {
        list = new ArrayList<>();
        A = new Morse("A", ".-");
        B = new Morse("B", "-...");
        C = new Morse("C", "-.-.");
        D = new Morse("D", "-..");
        E = new Morse("E", ".");
        F = new Morse("F", "..-.");
        G = new Morse("G", "--.");
        H = new Morse("H", "....");
        I = new Morse("I", "..");
        J = new Morse("J", ".---");
        K = new Morse("K", "-.-");
        L = new Morse("L", ".-..");
        M = new Morse("M", "--");
        N = new Morse("N", "-.");
        O = new Morse("O", "---");
        P = new Morse("P", ".--.");
        Q = new Morse("Q", "--.-");
        R = new Morse("R", ".-.");
        S = new Morse("S", "...");
        T = new Morse("T", "-");
        U = new Morse("U", "..-");
        V = new Morse("V", "...-");
        W = new Morse("W", ".--");
        X = new Morse("X", "-..-");
        Y = new Morse("Y", "-.--");
        Z = new Morse("Z", "--..");
        so1 = new Morse("1", ".----");
        so2 = new Morse("2", "..---");
        so3 = new Morse("3", "...--");
        so4 = new Morse("4", "....-");
        so5 = new Morse("5", ".....");
        so6 = new Morse("6", "-....");
        so7 = new Morse("7", "--...");
        so8 = new Morse("8", "---..");
        so9 = new Morse("9", "----.");
        so0 = new Morse("0", "-----");
        list.add(A);
        list.add(B);
        list.add(C);
        list.add(D);
        list.add(E);
        list.add(F);
        list.add(G);
        list.add(H);
        list.add(I);
        list.add(J);
        list.add(K);
        list.add(L);
        list.add(M);
        list.add(N);
        list.add(O);
        list.add(P);
        list.add(Q);
        list.add(R);
        list.add(S);
        list.add(T);
        list.add(U);
        list.add(V);
        list.add(W);
        list.add(X);
        list.add(Y);
        list.add(Z);
        list.add(so1);
        list.add(so2);
        list.add(so3);
        list.add(so4);
        list.add(so5);
        list.add(so6);
        list.add(so7);
        list.add(so8);
        list.add(so9);
        list.add(so0);
        return list;
    }

    void createGB() {
        gd = new JFrame("Chuyen doi");
        gd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gd.setLayout(new GridLayout(2, 3));
        gd.setSize(300, 200);
        lbWord = new JLabel("Nhap chu");
        gd.add(lbWord);
        txtWord = new JTextField();
        gd.add(txtWord);
        btnChange = new JButton("Change Word");
        gd.add(btnChange);
        btnChange.addActionListener(this);
        lbSound = new JLabel("Nhap Tic Te");
        gd.add(lbSound);
        txtSound = new JTextField();
        gd.add(txtSound);

        btnChangeB = new JButton("Change Sound");
        gd.add(btnChangeB);
        btnChangeB.addActionListener(this);
        gd.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String evt = ((JButton) e.getSource()).getText();
        String change = "";
        ds();
        if (evt.equals("Change Sound")) {
            String[] txt = txtSound.getText().split("");
            String a = "";
            for (int i = 0; i < txt.length; i++) {

                if (txt[i].equals(" ")) {
                    System.out.println(a + " 2");
                    for (int j = 0; j < list.size(); j++) {
                        if (a.equals(list.get(j).getSound())) {
                            change += list.get(j).getWord();
                        }
                    }
                    a = "";
                } else if (i == txt.length - 1) {
                    a += txt[i];
                    System.out.println(a);
                    for (int j = 0; j < list.size(); j++) {
                        if (a.equals(list.get(j).getSound())) {
                            change += list.get(j).getWord();
                        }
                    }
                    a = "";
                } else {
                    a += txt[i];
                }
            }
            txtWord.setText(change);
        } else {

            String[] txt = txtWord.getText().toUpperCase().split("");
            String a = "";
            for (int i = 0; i < txt.length; i++) {
                if (txt[i] != " ") {
                    for (int j = 0; j < list.size(); j++) {
                        if (txt[i].equals(list.get(j).getWord())) {
                            change += list.get(j).getSound();
                            change += " ";
                        }
                    }
                }
            }
            txtSound.setText(change);
        }
    }
}
