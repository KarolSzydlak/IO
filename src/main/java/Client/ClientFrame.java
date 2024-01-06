package Client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import GUI.MyPanel;
public class ClientFrame extends JFrame implements ActionListener {
    MyPanel myPanel;
    JButton rezerwuj,wyloguj,przegladaj,rezygnuj;
    JTextField nazwa;

    public ClientFrame(){
        this.setTitle("Widok klienta");
        rezerwuj = new JButton();
        wyloguj = new JButton();
        przegladaj = new JButton();
        rezygnuj = new JButton();

        rezerwuj.setBounds(50,100,200,50);
        przegladaj.setBounds(50,180,200,50);
        rezygnuj.setBounds(50,260,200,50);
        wyloguj.setBounds(50,340,200,50);

        rezerwuj.setText("Rezerwuj lot");
        przegladaj.setText("Przeglądaj rezerwacje");
        rezygnuj.setText("Rezygnuj z rezerwacji");
        wyloguj.setText("Wyloguj");

        this.add(rezerwuj);
        this.add(przegladaj);
        this.add(rezygnuj);
        this.add(wyloguj);

        myPanel = new MyPanel();
        /////
        this.add(myPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[] args){
        new ClientFrame();
    }
}
