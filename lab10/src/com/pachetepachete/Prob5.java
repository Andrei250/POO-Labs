package com.pachetepachete;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Prob5 extends JFrame implements ActionListener {
    private JButton btn;
    private ArrayList<Color> vct;

    public Prob5(String title) {
        super(title);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(100, 100));
        getContentPane().setBackground(Color.blue);
        setLayout(new FlowLayout());

        vct = new ArrayList<>();

        vct.add(Color.BLUE);
        vct.add(Color.RED);
        vct.add(Color.GREEN);
        vct.add(Color.YELLOW);
        vct.add(Color.WHITE);

        btn = new JButton("Change my color");
        btn.setEnabled(true);
        btn.setMnemonic(KeyEvent.VK_C);
        btn.addActionListener(this);

        add(btn);
        show();
        pack();
    }

    public static void main(String[] args) {
        Prob5 test = new Prob5("TEST");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 5);
        int randomNum1 = ThreadLocalRandom.current().nextInt(0, 5);
        btn.setBackground(vct.get(randomNum));
        btn.setForeground(vct.get(randomNum1));
    }
}
