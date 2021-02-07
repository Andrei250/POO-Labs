package com.pachetepachete;

import javax.swing.*;
import java.awt.*;

public class BookRenderer extends JPanel implements ListCellRenderer {
    JLabel title, author, img;

    public BookRenderer() {
        setOpaque(true);
        this.title = new JLabel();
        this.author = new JLabel();
        this.img = new JLabel();


    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        this.img.setIcon(new ImageIcon("./src/com/pachetepachete/Imagini/" + ((Book) value).getIconName() + ".jpg"));
        this.title.setText(((Book) value).getName());
        this.author.setText(((Book) value).getAuthor());

        add(this.img);
        add(this.author);
        add(this.title);
        setForeground(Color.black);

        if (isSelected) {
            setBackground(Color.red);
        } else if (index % 2 == 0) {
            setBackground(Color.green);
        } else {
            setBackground(Color.yellow);
        }

        return this;
    }
}
