package JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame{

    private JTextField campo;
    private JLabel lbl1;
    private JButton btn1;

    public Formulario(){
        campo = new JTextField();
        campo.setBounds(20,50,400,30);
        add(campo);

        lbl1 = new JLabel("");
        lbl1.setBounds(20,100,400,50);
        add(lbl1);

        btn1 = new JButton("Executar");
        btn1.setBounds(20,200,200,40);
        add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String texto = campo.getText();
                lbl1.setText(texto);
                campo.setText("");
            }
        });
    }

    public static void main(String [] args){
        Formulario form = new Formulario();
        form.setLayout(null);
        form.setBounds(0,0,600,400);
        form.setVisible(true);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setResizable(false);
        form.setLocationRelativeTo(null);
        form.setTitle("Minha Aplicação Gráfica");
    }
}
