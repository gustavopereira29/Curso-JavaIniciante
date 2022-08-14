package JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBox extends JFrame {

    private JComboBox combo;

    public ComboBox() {
        combo = new JComboBox();
        combo.setBounds(50,100,300,30);
        add(combo);

        combo.addItem("-- Selecione uma opção --");
        combo.addItem("Vermelho");
        combo.addItem("Amarelo");
        combo.addItem("Azul");
        combo.addItem("Rosa");

        combo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String texto = combo.getSelectedItem().toString();
                if(!texto.equals ("-- Selecione uma opção --")){
                    setTitle(texto);
                }
            }
        });
    }

    public static void main(String [] args){
        ComboBox form = new ComboBox();
        form.setLayout(null);
        form.setBounds(0,0,600,400);
        form.setVisible(true);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setResizable(false);
        form.setLocationRelativeTo(null);
        form.setTitle("Minha Aplicação Gráfica");
    }
}
