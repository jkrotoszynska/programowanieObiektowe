package com.company.zad9;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Notatnik extends JFrame implements ActionListener {
    private final JTextArea tekst;
    private final JMenuItem otworzPlik;
    private final JMenuItem zapiszPlik;
    private final JMenuItem zamknij;

    public Notatnik() throws HeadlessException {
        super("Kolejny notatnik");

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("Plik");
        menuBar.add(file);

        otworzPlik = new JMenuItem("Otworz...");
        otworzPlik.addActionListener(this);
        file.add(otworzPlik);

        zapiszPlik = new JMenuItem("Zapisz...");
        zapiszPlik.addActionListener(this);
        file.add(zapiszPlik);

        zamknij = new JMenuItem("Zamknij");
        zamknij.addActionListener(this);
        file.add(zamknij);

        tekst = new JTextArea("");

        setContentPane(new JScrollPane(tekst));
        setJMenuBar(menuBar);

        setSize(640, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent zdarzenie) {
        if(zdarzenie.getSource() == this.zamknij)
            dispose();
        else if(zdarzenie.getSource() == this.otworzPlik){
            JFileChooser otworz = new JFileChooser();
            int opcja = otworz.showOpenDialog(this);
            if(opcja == JFileChooser.APPROVE_OPTION){
               tekst.setText("");
                try {
                    String linia;
                    BufferedReader in = new BufferedReader(new FileReader(otworz.getSelectedFile().getPath()));
                    while((linia = in.readLine()) != null){
                        tekst.append(linia +"\n");
                    }
                    in.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                            "Odczytanie nieudane",
                            "Błąd",
                            JOptionPane.ERROR_MESSAGE);
                    dispose();
                }
            }

        }
        else if(zdarzenie.getSource() == this.zapiszPlik){
            JFileChooser zapis = new JFileChooser();
            int opcja = zapis.showSaveDialog(this);
            if(opcja == JFileChooser.APPROVE_OPTION){
                try {
                    BufferedWriter out = new BufferedWriter(new FileWriter(zapis.getSelectedFile().getPath()));
                    out.write(tekst.getText());
                    out.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                            "Zapis nieudany",
                            "Błąd",
                            JOptionPane.ERROR_MESSAGE);
                    dispose();
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(Notatnik::new);
    }
}
