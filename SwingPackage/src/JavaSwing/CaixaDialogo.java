package JavaSwing;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;

public class CaixaDialogo extends JFrame implements ActionListener {
    private JButton btn1;

    public CaixaDialogo() {

        btn1 = new JButton("Executar");
        btn1.setBounds(200, 200, 200, 50);
        add(btn1);
        btn1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {

            JOptionPane.showMessageDialog(this, "Texto da mensagem", "Titulo da Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String args[]) {
        CaixaDialogo form = new CaixaDialogo();
        form.setLayout(null);
        form.setBounds(0, 0, 700, 450);
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        form.setTitle("Caixa de Dialogo");
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
