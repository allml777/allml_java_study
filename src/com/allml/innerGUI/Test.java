package com.allml.innerGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        JFrame win = new JFrame("µÇÂ¼½çÃæ");
        JPanel panel = new JPanel();
        JButton btn = new JButton("µÇÂ¼");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("´¥·¢");
                JOptionPane.showMessageDialog(win,"AAA");
            }
        });

        win.add(panel);
        panel.add(btn);
        win.setSize(600,300);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win.setVisible(true);

    }
}
