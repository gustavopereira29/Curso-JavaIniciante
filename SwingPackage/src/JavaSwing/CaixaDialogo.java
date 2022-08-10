package JavaSwing;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;

public class CaixaDialogo extends JFrame implements ActionListener {
    private JButton btn1;
    private JLabel resposta;

    public CaixaDialogo() {

        btn1 = new JButton("Executar");
        btn1.setBounds(200, 200, 200, 50);
        add(btn1);
        btn1.addActionListener(this);

        resposta = new JLabel("Resposta do Usuário");
        resposta.setBounds(10,10,400,100);
        add(resposta);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {

            // JOptionPane.showMessageDialog(this, "Texto da mensagem", "Titulo da Mensagem", JOptionPane.INFORMATION_MESSAGE);

            int res = JOptionPane.showConfirmDialog
                    (this, "Confirma a ação?", "Confirme",JOptionPane.OK_CANCEL_OPTION);

            if(res == JOptionPane.YES_OPTION){
                resposta.setText("Clicou em OK.");
            }else if(res == JOptionPane.CANCEL_OPTION){
                resposta.setText("Clicou em Cancelar.");
            }else if(res == JOptionPane.CLOSED_OPTION){
                resposta.setText("App finalizado");

                //Opçâo abaixo usada com o JOPtionPane.YES_NO_CANCEL_OPTION
            }/*else if(res == JOptionPane.CLOSED_OPTION){
                resposta.setText("App finalizado");
            }*/
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

// Tipos de Mensagem - showMessageDialog
// INFORMATION_MESSAGE
// ERROR_MESSAGE
// WARNING_MESSAGE
// QUESTION_MESSAGE
// PLAIN_MESSAGE

// Tipos de Mensagens -showConfirmDialog
// DEFAULT_OPTION
// YES_NO_OPTION
// YES_NO_CANCEL_OPTION
// OK_CANCEL_OPTION

// Respostas
// YES_OPTION
// NO_OPTION
// CANCEL_OPTION
// OK_OPTION
// CLOSE_OPTION