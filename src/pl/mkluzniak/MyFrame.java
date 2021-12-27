package pl.mkluzniak;

import java.awt.*;


import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon icon = new ImageIcon("PIN2.png");
        ImageIcon icon2 = new ImageIcon("PIN.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 150, 300, 300); //where is placed label what will be show after click button
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 50, 300, 100); //where is placed button
        button.addActionListener(this);
        button.setText("I'm a button!");

        button.setFocusable(false);//it get rid of box around text
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.RIGHT);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(10);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("poo");
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}