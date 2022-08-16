package JavaSwing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class RadioButton extends JFrame {

    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup bg;

    public RadioButton(){
        bg = new ButtonGroup();

        radio1 = new JRadioButton("400 x 300");
        radio1.setBounds(20,50,300,30);
        add(radio1);
        bg.add(radio1);
        radio1.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        if(radio1.isSelected()){
                            setSize(400,300);
                        }
                    }
                }
        );

        radio2 = new JRadioButton("600 x 400");
        radio2.setBounds(20,100,300,30);
        add(radio2);
        bg.add(radio2);
        radio2.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        if(radio2.isSelected()){
                            setSize(600,400);
                        }
                    }
                }
        );

        radio3 = new JRadioButton("800 x 500");
        radio3.setBounds(20,150,300,30);
        add(radio3);
        bg.add(radio3);
        radio3.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        if(radio3.isSelected()){
                            setSize(800,500);
                        }
                    }
                }
        );
    }
        //podemos usar o metódo anonimo(acima) ou implementar como está abaixo
    /*public void stateChanged(ChangeEvent e){
        if(radio1.isSelected()){
            setSize(400,300);
        }
        else if(radio2.isSelected()){
            setSize(600,400);
        }
        else if(radio3.isSelected()){
            setSize(800,500);
        }
    }*/

    public static void main(String [] args){
            RadioButton form = new RadioButton();
            form.setLayout(null);form.setBounds(0,0,600,400);
            form.setVisible(true);
            form.setDefaultCloseOperation(EXIT_ON_CLOSE);
            form.setResizable(false);
            form.setLocationRelativeTo(null);
            form.setTitle("Minha Aplicação Gráfica");
        }
}

