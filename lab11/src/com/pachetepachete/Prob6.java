package com.pachetepachete;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prob6 extends JFrame implements ListSelectionListener {
    JList<Book> lst;
    JTextField author;
    JTextField title;
    DefaultListModel<Book> el;

    public Prob6() {
        super("Titlu");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 200));
        getContentPane().setBackground(Color.blue);
        setLayout(new FlowLayout());

        el = new DefaultListModel<>();
        JScrollPane scrollPane = new JScrollPane();

        el.addElement(new Book("Carte1", "Autor1", "android"));
        el.addElement(new Book("Carte0", "Autor0", "android"));
        el.addElement(new Book("Carte2", "Autor2", "android"));
        el.addElement(new Book("Carte3", "Autor3", "android"));
        el.addElement(new Book("Carte4", "Autor4", "android"));
        el.addElement(new Book("Carte6", "Autor6", "cs"));
        el.addElement(new Book("Carte5", "Autor5", "cs"));
        el.addElement(new Book("Carte5", "Autor5", "cpp"));
        el.addElement(new Book("Carte5", "Autor5", "cpp"));
        el.addElement(new Book("Carte5", "Autor5", "java"));
        el.addElement(new Book("Carte5", "Autor5", "wp"));
        el.addElement(new Book("Carte5", "Autor5", "ios"));

        lst = new JList<>(el);
        scrollPane.setViewportView(lst);
        lst.setLayoutOrientation(JList.VERTICAL);
        lst.setCellRenderer(new BookRenderer());
        add(scrollPane);

        show();
        pack();
    }

    public static void main(String[] args) {
        Prob6 lst = new Prob6();
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if(lst.isSelectionEmpty()) {
            return;
        }


    }


}
