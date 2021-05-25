package com.company.zad10;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PanelGry extends JPanel {
    BufferedImage obrazek;
    int x,y,r;

    public PanelGry(Dimension d, String sciezka) {
        super();
        setPreferredSize(d);
        setBackground(Color.white);

        this.x = 0;
        this.y = 0;

        try {
            this.obrazek = ImageIO.read(new File(sciezka));
            this.r = obrazek.getWidth();
            if(obrazek.getWidth() != obrazek.getHeight()){
                throw new IllegalArgumentException();
            }
        } catch (IOException | IllegalArgumentException e) {
            this.obrazek = null;
            this.r = 50;
        }

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(obrazek != null){
            g.drawImage(obrazek, x, y, null);
            }else{
                g.setColor(Color.red);
                g.fillOval(x, y, r, r);
            }
        }
    }


