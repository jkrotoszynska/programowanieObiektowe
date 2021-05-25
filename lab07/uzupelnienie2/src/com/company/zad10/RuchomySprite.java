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

        p = new PanelGry(new Dimension(400,400), "src/resources/celownik.png");

        JPanel btnPanel = new JPanel(new FlowLayout());

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

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(p, BorderLayout.CENTER);
        cp.add(btnPanel, BorderLayout.SOUTH);

        addKeyListener(this);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnLewo){
            p.x -= 10;
        }else if(e.getSource() == btnPrawo){
            p.x += 10;
        }else if(e.getSource() == btnGora){
            p.y -= 10;
        }else if(e.getSource() == btnDol){
            p.y += 10;
        }
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                p.x -= 10;
                break;
            case KeyEvent.VK_RIGHT:
                p.x += 10;
                break;
            case KeyEvent.VK_UP:
                p.y -= 10;
                break;
            case KeyEvent.VK_DOWN:
                p.y += 10;
                break;
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
