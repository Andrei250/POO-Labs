package com.pachetepachete;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Prob4 extends JFrame implements ChangeListener {
    private JSlider R;
    private JSlider G;
    private JSlider B;
    private JTextField txt;

    public Prob4(String title) {
        super(title);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 200));
        getContentPane().setBackground(Color.blue);
        setLayout(new FlowLayout());

        R = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        G = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        B = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);

        R.addChangeListener(this);
        G.addChangeListener(this);
        B.addChangeListener(this);

        add(R);
        add(G);
        add(B);

        txt = new JTextField("TESTER");
        txt.setEnabled(false);
        add(txt);

        show();
        pack();
    }

    public static void main(String[] args) {
        Prob4 test = new Prob4("TEST");
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        txt.setText(Integer.toHexString(R.getValue()).toString() + Integer.toHexString(G.getValue()).toString() + Integer.toHexString(B.getValue()).toString());
    }
}
