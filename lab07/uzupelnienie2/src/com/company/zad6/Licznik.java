package com.company.zad6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Licznik extends JFrame implements ActionListener {
    private final JLabel label;

    public Licznik() throws HeadlessException {
        super("Licznik");
        this.label = new JLabel("0");

        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(this);
        JButton btnMinus = new JButton("-");
        btnMinus.addActionListener(this);

        JPanel p = new JPanel(new GridLayout(1,3));
        p.add(btnPlus);
        p.add(btnMinus);
        p.add(label);

        setContentPane(p);

        setSize(250,70);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent zdarzenie) {
        if(zdarzenie.getActionCommand().equals("+")){
            int n = Integer.parseInt(label.getText()) +1;
            label.setText(Integer.toString(n));
        }else if(zdarzenie.getActionCommand().equals("-")){
            int n = Integer.parseInt((label.getText())) -1;
            label.setText(Integer.toString(n));
        }
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(Licznik::new);
    }
}
