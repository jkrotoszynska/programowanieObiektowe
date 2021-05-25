package com.company.zad10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class RuchomySprite extends JFrame implements KeyListener, ActionListener {
    JButton btnLewo;
    JButton btnPrawo;
    JButton btnGora;
    JButton btnDol;
    PanelGry p;

    public RuchomySprite(){
        super("Ruchomy Duszek");

        p = new PanelGry()

        JPanel btnPanel = new JPanel(new FlowLayout())

        btnLewo = new JButton("Lewo ");
        btnLewo.addActionListener(this);
        btnPanel.add(btnLewo);

        btnPrawo = new JButton("Prawo");
        btnPrawo.addActionListener(this);
        btnPanel.add(btnPrawo);

        btnGora = new JButton("Gora");
        btnGora.addActionListener(this);
        btnPanel.add(btnGora);

        btnDol = new JButton("Dol");
        btnDol.addActionListener(this);
        btnPanel.add(btnDol);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
