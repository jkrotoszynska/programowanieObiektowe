package com.company.zad8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Logowanie extends JFrame implements ActionListener {
    JTextField tfUzytkownik;
    JTextField tfHaslo;
    JButton btnOK;
    JButton btnAnuluj;

    public Logowanie() throws HeadlessException {
        super("Logowanie");
        tfUzytkownik = new JTextField("");
        tfHaslo = new JTextField("");
        btnOK = new JButton("OK");
        btnOK.addActionListener(this);
        btnAnuluj = new JButton("Anuluj");
        btnAnuluj.addActionListener(this);

        JPanel p = new JPanel(new GridLayout(3,2));
        p.add(new JLabel("Użytkownik:"));
        p.add(tfUzytkownik);
        p.add(new JLabel("Hasło:"));
        p.add(tfHaslo);
        p.add(btnAnuluj);
        p.add(btnOK);


        setContentPane(p);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(350, 150);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent zdarzenie){
        System.out.println(zdarzenie.getActionCommand());
        if(zdarzenie.getActionCommand().equals("Anuluj")){
            dispose();
        }else if(zdarzenie.getActionCommand().equals("OK")){
            if(tfUzytkownik.getText().equals("admin") && (tfHaslo.getText().equals("admin"))){
                JOptionPane.showMessageDialog(this,
                        "Logowanie pomyślne",
                        "Logowanie",
                        JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this,
                        "Logowanie nieudane",
                        "Logowanie",
                        JOptionPane.WARNING_MESSAGE);
            }
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Logowanie::new);
    }
}
