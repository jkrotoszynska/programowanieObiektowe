package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Liczydlo extends JFrame implements ActionListener{
    private final JButton plus;
    private final JButton minus;
    private final JButton mnoznik;
    private final JButton dzielnik;
    private final JButton reszta;
    private final JButton czysc;

    private final JTextField liczbaA;
    private final JTextField liczbaB;
    private final JTextField wynik;

    public Liczydlo() throws HeadlessException {
        super("Liczydlo");

        // przyciski
        plus = new JButton("+");
        plus.addActionListener(this);
        plus.setBackground(new Color(220,220,220));
        minus = new JButton("-");
        minus.addActionListener(this);
        minus.setBackground(new Color(220,220,220));
        mnoznik = new JButton("*");
        mnoznik.addActionListener(this);
        mnoznik.setBackground(new Color(220,220,220));
        dzielnik = new JButton("/");
        dzielnik.addActionListener(this);
        dzielnik.setBackground(new Color(220,220,220));
        reszta = new JButton("%");
        reszta.addActionListener(this);
        reszta.setBackground(new Color(220,220,220));
        czysc = new JButton("Czysc");
        czysc.addActionListener(this);
        czysc.setBackground(new Color(220,220,220));

        // wpisywanie i wynik
        liczbaA = new JTextField("0");
        liczbaA.setHorizontalAlignment(SwingConstants.RIGHT);
        liczbaB = new JTextField("0");
        liczbaB.setHorizontalAlignment(SwingConstants.RIGHT);
        wynik = new JTextField("0");
        wynik.setEditable(false);
        wynik.setHorizontalAlignment(SwingConstants.RIGHT);

        // główny panel
        JPanel p1 = new JPanel(new GridLayout(6,2,15,5));
        p1.add(plus);
        p1.add(minus);
        p1.add(mnoznik);
        p1.add(dzielnik);
        p1.add(reszta);
        p1.add(czysc);
        p1.add(new JLabel("Liczba A"));
        p1.add(liczbaA);
        p1.add(new JLabel("Liczba B"));
        p1.add(liczbaB);
        p1.add(new JLabel("Wynik"));
        p1.add(wynik);

        // okno
        setContentPane(p1);
        setSize(350,250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent zdarzenie) {
        // dodawanie
        if (zdarzenie.getActionCommand().equals("+")) {
            double n = Double.parseDouble(liczbaA.getText()) + Double.parseDouble(liczbaB.getText());
            wynik.setText(Double.toString(n));
        }
        // odejmowanie
        else if (zdarzenie.getActionCommand().equals("-")) {
            double n = Double.parseDouble(liczbaA.getText()) - Double.parseDouble(liczbaB.getText());
            wynik.setText(Double.toString(n));
        }
        // mnozenie
        else if (zdarzenie.getActionCommand().equals("*")) {
            double n= Double.parseDouble(liczbaA.getText()) * Double.parseDouble(liczbaB.getText());
            wynik.setText(Double.toString(n));
        }
        // dzielenie
        else if (zdarzenie.getActionCommand().equals("/")) {
            double n = Double.parseDouble(liczbaA.getText()) / Double.parseDouble(liczbaB.getText());
            if (Double.parseDouble(liczbaB.getText()) != 0){
                wynik.setText(Double.toString(n));
            } else {
                JOptionPane.showMessageDialog(this, "Nie dziel przez 0!", "Błąd", JOptionPane.ERROR_MESSAGE);
            }
        }
        // reszta
        else if (zdarzenie.getActionCommand().equals("%")) {
            double n = Double.parseDouble(liczbaA.getText()) % Double.parseDouble(liczbaB.getText());
            if (Double.parseDouble(liczbaB.getText()) != 0){
                wynik.setText(Double.toString(n));
            } else {
                JOptionPane.showMessageDialog(this, "Nie dziel przez 0!", "Błąd", JOptionPane.ERROR_MESSAGE);
            }
        }

        // czyszczenie
        else if (zdarzenie.getActionCommand().equals("Czysc")){
            liczbaA.setText(Double.toString(0));
            liczbaB.setText(Double.toString(0));
            wynik.setText(Double.toString(0));

        }
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(Liczydlo::new);
    }
}
