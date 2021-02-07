package com.pachetepachete;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prob1 extends JFrame implements ActionListener {
    private JButton btn;
    private JTextField comp1, comp2, comp3, comp4;

    public Prob1(String text, String buton) {
        super(text);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 200));
        getContentPane().setBackground(Color.blue);
        setLayout(new FlowLayout());
        btn = new JButton (buton);
        btn.addActionListener(this);
        add(btn);
        comp1 = new JTextField(15);
        comp2 = new JTextField(15);
        comp3 = new JTextField(15);
        comp4 = new JTextField(15);
        add(comp1);
        add(comp2);
        add(comp3);
        add(comp4);
        show();
        pack();
    }

    public JButton getBtn() {
        return btn;
    }

    public void setBtn(JButton btn) {
        this.btn = btn;
    }

    public JTextField getComp1() {
        return comp1;
    }

    public void setComp1(JTextField comp1) {
        this.comp1 = comp1;
    }

    public JTextField getComp2() {
        return comp2;
    }

    public void setComp2(JTextField comp2) {
        this.comp2 = comp2;
    }

    public JTextField getComp3() {
        return comp3;
    }

    public void setComp3(JTextField comp3) {
        this.comp3 = comp3;
    }

    public JTextField getComp4() {
        return comp4;
    }

    public void setComp4(JTextField comp4) {
        this.comp4 = comp4;
    }

    public static void main(String[] args) {
        Prob1 test = new Prob1("Test", "Apasa");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();
        if (button.getText().equals("Apasa")){
            comp4.setText(comp1.getText() + comp2.getText() + comp3.getText());
        }
    }
}
