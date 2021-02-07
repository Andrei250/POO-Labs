package com.pachetepachete;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Lista extends JFrame {

    public Lista() {
        super("Titlu");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 200));
        getContentPane().setBackground(Color.blue);
        setLayout(new FlowLayout());

        Vector<Book> el = new Vector<>();
        JScrollPane scrollPane = new JScrollPane();

        el.add(new Book("Carte1", "Autor1", ""));
        el.add(new Book("Carte0", "Autor0", ""));
        el.add(new Book("Carte2", "Autor2", ""));
        el.add(new Book("Carte3", "Autor3", ""));
        el.add(new Book("Carte4", "Autor4", ""));
        el.add(new Book("Carte6", "Autor6", ""));
        el.add(new Book("Carte5", "Autor5", ""));
        el.add(new Book("Carte5", "Autor5", ""));
        el.add(new Book("Carte5", "Autor5", ""));
        el.add(new Book("Carte5", "Autor5", ""));
        el.add(new Book("Carte5", "Autor5", ""));
        el.add(new Book("Carte5", "Autor5", ""));

        JList<Book> lst = new JList<>(el);
        scrollPane.setViewportView(lst);
        lst.setLayoutOrientation(JList.VERTICAL);
        add(scrollPane);

        show();
        pack();
    }

    public static void main(String[] args) {
        Lista lst = new Lista();
    }
}
