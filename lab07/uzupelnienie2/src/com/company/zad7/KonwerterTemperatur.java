package com.company.zad7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KonwerterTemperatur extends JFrame implements ActionListener {
    private final JButton CdoFBTN;
    private final JButton FdoCBTN;
    private final JTextField fahrenheitTF;
    private final JTextField celsjuszTF;

    public KonwerterTemperatur() throws HeadlessException {
        super("Konwerter Temperatur");
        celsjuszTF = new JTextField("0");
        fahrenheitTF = new JTextField("32");
        CdoFBTN = new JButton("C-> F");
        CdoFBTN.addActionListener(this);
        FdoCBTN = new JButton("F->C");
        FdoCBTN.addActionListener(this);

        JPanel p1 = new JPanel(new GridLayout(2,2));
        p1.add(celsjuszTF);
        p1.add(new JLabel("C"));
        p1.add(fahrenheitTF);
        p1.add(new JLabel("F"));

        JPanel p2 = new JPanel(new GridLayout(1,2));
        p2.add(CdoFBTN);
        p2.add(FdoCBTN);

        JPanel p3 = new JPanel(new BorderLayout());
        p3.add(p1, BorderLayout.NORTH);
        p3.add(p2, BorderLayout.SOUTH);

        setContentPane(p3);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(200, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent zdarzenie) {
        if (zdarzenie.getSource() == CdoFBTN) {
            double tempFahrenheit = Double.parseDouble(
                    celsjuszTF.getText()) * 1.8 + 32;
            fahrenheitTF.setText(Double.toString(tempFahrenheit));

            if (tempFahrenheit < 32) {
                JOptionPane.showMessageDialog(this,
                        "Water freezes here!",
                        "Ostrzeżenie",
                        JOptionPane.WARNING_MESSAGE);
            }
        } else if (zdarzenie.getSource() == FdoCBTN) {
            double tempCelsius = (Double.parseDouble(
                    fahrenheitTF.getText()) - 32) * 0.555;
            celsjuszTF.setText(Double.toString(tempCelsius));

            if (tempCelsius < 0) {
            }
            JOptionPane.showMessageDialog(this,
                    "Water freezes here!",
                    "Ostrzeżenie",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(KonwerterTemperatur::new);
    }
}
