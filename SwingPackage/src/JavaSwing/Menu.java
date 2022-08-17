package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {

    private JMenuBar barra;
    private JMenu menu1, menu2, menu3, menu4;
    private JMenuItem item1, item2, item3, item4, item5, item6, item7;

    public Menu(){

        barra = new JMenuBar();
        setJMenuBar(barra);

        menu1 = new JMenu("Arquivo");
        barra.add(menu1);

        menu2 = new JMenu("Editar");
        barra.add(menu2);

        menu3 = new JMenu("Ajuda");
        barra.add(menu3);

        menu4 = new JMenu("Opções");
        menu2.add(menu4);

        item1 = new JMenuItem("Novo");
        menu1.add(item1);
        item1.addActionListener(this);

        item2 = new JMenuItem("Sair");
        menu1.add(item2);
        item2.addActionListener(this);

        item3 = new JMenuItem("Copiar");
        menu2.add(item3);
        item3.addActionListener(this);

        item4 = new JMenuItem("Colar");
        menu2.add(item4);
        item4.addActionListener(this);

        item5 = new JMenuItem("Sobre");
        menu3.add(item5);
        item5.addActionListener(this);

        item6 = new JMenuItem("Cor de Fundo");
        menu4.add(item6);
        item6.addActionListener(this);

        item7 = new JMenuItem("Tamanho da Janela");
        menu4.add(item7);
        item7.addActionListener(this);

    }
    public void actionPerformed (ActionEvent e){
        if(e.getSource() == item1){
            setTitle("Clicou em Novo");
        }
        else if(e.getSource() == item2){
            System.exit(0);
        }
        else if(e.getSource() == item3) {
            setTitle("Clicou em Copiar");
        }
        else if(e.getSource() == item4){
            setTitle("Clicou em Colar");
        }
        else if(e.getSource() == item5){
            setTitle("Clicou em Sobre");
        }
        else if(e.getSource() == item6){
            setTitle("Clicou em Cor de Fundo");
        }
        else if(e.getSource() == item7){
            setTitle("Clicou em Tamanho da Janela");
        }
    }

    public static void main(String[] args){

        Menu form = new Menu();
        form.setLayout(null);
        form.setBounds(0,0,600,400);
        form.setVisible(true);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setResizable(false);
        form.setLocationRelativeTo(null);
        form.setTitle("Aplicação com Menus");

    }
}
