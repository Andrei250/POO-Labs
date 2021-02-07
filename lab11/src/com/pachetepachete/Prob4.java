package com.pachetepachete;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.io.File;

public class Prob4 extends JFrame {
    JTree tree;
    JTable table;

    public Prob4(String path) {
        super("Titlu");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 200));
        getContentPane().setBackground(Color.blue);
        setLayout(new FlowLayout());

        tree = new JTree();
        table = new JTable();

//        DefaultMutableTreeNode root = getRoot(path);

    }
//
//    public DefaultMutableTreeNode getRoot(String path) {
//        File dir = new File(path);
//
//    }


    public static void main(String[] args) {
        Prob4 test = new Prob4("/");
    }
}
