package com.pachetepachete;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Prob2 extends JFrame implements ActionListener {
    private JButton btn;
    private JRadioButton ansLbl1;
    private JRadioButton ansLbl2;
    private JRadioButton ansLbl3;
    private JRadioButton ansLbl4;
    private JTextField question;

    public Prob2(String title, String ans1, String ans2, String ans3, String ans4, String ques) {
        super(title);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 200));
        getContentPane().setBackground(Color.blue);
        setLayout(new FlowLayout());

        question = new JTextField(ques);
        question.setEnabled(false);
        add(question);

        ButtonGroup G = new ButtonGroup();
        ansLbl1 = new JRadioButton(ans1);
        ansLbl2 = new JRadioButton(ans2);
        ansLbl3 = new JRadioButton(ans3);
        ansLbl4 = new JRadioButton(ans4);
        ansLbl1.addActionListener(this);
        ansLbl2.addActionListener(this);
        ansLbl3.addActionListener(this);
        ansLbl4.addActionListener(this);

        G.add(ansLbl1);
        G.add(ansLbl2);
        G.add(ansLbl3);
        G.add(ansLbl4);
        add(ansLbl1);
        add(ansLbl2);
        add(ansLbl3);
        add(ansLbl4);

        btn = new JButton("Apasa");
        btn.addActionListener(this);
        btn.setEnabled(false);
        add(btn);

        show();
        pack();
    }

    public static void main(String[] args) {
        Vector<String> vct = new Vector<>();

        try {
            File obj = new File("/home/dumi/Documents/OOP/lab10/src/com/pachetepachete/intrebare.txt");
            Scanner read = new Scanner(obj);
            while (read.hasNextLine()) {
                String data = read.nextLine();
                vct.add(data);
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Prob2 test;

        if (vct.size() >= 5) {
            test = new Prob2("Title", vct.get(1), vct.get(2), vct.get(3), vct.get(4), vct.get(0));
        } else {
            test = new Prob2("Title", "DA", "DA", "DA", "DA", "DA");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JRadioButton ) {
            System.out.println("DA");
            if (((JRadioButton) e.getSource()).isSelected()) {
                btn.setEnabled(true);
            }
        } else if (e.getSource() instanceof JButton) {
            if (ansLbl1.isSelected()) {
                ansLbl1.setBackground(Color.green);
            } else {
                ansLbl1.setBackground(Color.red);
            }
        }


    }
}
