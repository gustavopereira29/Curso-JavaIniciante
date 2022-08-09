package JavaSwing;

import javax.swing.*;
import java.awt.event.*;

public class Button extends JFrame {
    private JLabel titulo;
    private JButton btn1;
    public Button(){
        titulo = new JLabel("Click on Button");
        titulo.setBounds(10,10,500,30);
        add(titulo);

        btn1 = new JButton("Click");
        btn1.setBounds(250,250,200,50);
        add(btn1);
        btn1.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                       // System.exit(0);
                        titulo.setText("The button has been clicked");
                    }
                }
        );

    }
    // existe duas formas de adicionar um evento ActionListener, essa aqui e a forma acima
    /*public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn1){
            System.exit(0);
        }
    }*/

    public static void main(String args[]){
        Button form = new Button();
        form.setLayout(null);
        form.setBounds(0,0,700,500);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setTitle("Aula sobre JButton");
    }
}
