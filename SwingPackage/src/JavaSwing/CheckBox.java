package JavaSwing;

import javax.swing.*;
import javax.swing.event.*;

public class CheckBox extends JFrame {
    private JCheckBox check1, check2, check3;
    private JLabel labelResultado;

    public CheckBox(){
        check1 = new JCheckBox("Futebol");
        check1.setBounds(20,50,300,30);
        add(check1);
        check1.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        verificar();
                    }
                }
        );

        check2 = new JCheckBox("Basquete");
        check2.setBounds(20,80,200,30);
        add(check2);
        check2.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        verificar();
                    }
                }
        );

        check3 = new JCheckBox("Vôlei");
        check3.setBounds(20,110,200,30);
        add(check3);
        check3.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        verificar();
                    }
                }
        );

        labelResultado = new JLabel("");
        labelResultado.setBounds(20,200,400,60);
        add(labelResultado);
    }
    private void verificar(){
        String esportes = " ";

        if(check1.isSelected()){
            esportes += "Futebol ";
        }
        if(check2.isSelected()){
            esportes += "Basquete ";
        }
        if(check3.isSelected()){
            esportes += "Vôlei ";
        }
        labelResultado.setText(esportes);
    }

    //podemos usar o metódo anonimo(acima) ou implementar como está abaixo

    /*public void stateChanged(ChangeEvent e){
        String esportes = " ";

        if(check1.isSelected()){
            esportes += "Futebol ";
        }
        if(check2.isSelected()){
            esportes += "Basquete ";
        }
        if(check3.isSelected()){
            esportes += "Vôlei ";
        }
        labelResultado.setText(esportes);
    }*/

    public static void main(String [] args){
        CheckBox form = new CheckBox();
        form.setLayout(null);form.setBounds(0,0,600,400);
        form.setVisible(true);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setResizable(false);
        form.setLocationRelativeTo(null);
        form.setTitle("Minha Aplicação Gráfica");
    }
}



