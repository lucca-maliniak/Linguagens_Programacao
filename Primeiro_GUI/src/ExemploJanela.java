import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploJanela extends JFrame {
    // attbs
    private JPanel painel = new JPanel();
    private JButton jButtonLimpar = new JButton("Limpar");
    private JTextField jTextFieldTexto = new JTextField("Teste", 20);
    private JLabel jLabelMensagem = new JLabel("Exemplo Simples de Janela");


    // constructor
    public ExemploJanela(){
        this.setTitle("Texto da Barra de Título");
        this.setSize(300,200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 20));
        painel.setBackground(new Color(255,255,255));
        painel.add(jTextFieldTexto);
        painel.add(jButtonLimpar);
        painel.add(jLabelMensagem);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); // center the window
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ExemploJanela();
    }
}
