package JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioDois extends JFrame{

    private JTextArea txt;
    private JScrollPane barras;


    public FormularioDois() {
        txt = new JTextArea();
        //Não é necessario definir o set.Bounds e o comando add caso essas propriedades
        //foram instansiadas por outra variavel no mesmo escopo
        /* txt.setBounds(20,50,400,300);
        add(txt);*/

        barras = new JScrollPane(txt);
        barras.setBounds(20,50,400,300);
        add(barras);
    }

    public static void main(String [] args){
        FormularioDois form = new FormularioDois();
        form.setLayout(null);
        form.setBounds(0,0,600,400);
        form.setVisible(true);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setResizable(false);
        form.setLocationRelativeTo(null);
        form.setTitle("Minha Aplicação Gráfica");
    }
}