import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class primeiroApp {
    
    public static void main(String[] args) {
        System.out.println("Olá Mundo GUI");

        JFrame frame = new JFrame("Minha Primeira Janela");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setLayout(new BorderLayout());

        JButton button = new JButton(" <3 Clique em mim!! <3 ");
        button.setBackground(Color.pink);
        button.setForeground(Color.white);
        button.setPreferredSize(new Dimension(200, 50));

        JTextField textField = new JTextField(10);
        textField.setFont(new Font("Serif", Font.BOLD, 36));

        JLabel label = new JLabel("Digite o seu nome!!!");
        label.setFont(new Font("Serif", Font.BOLD, 36));

        //Adiciona um Listener no click do botao
        button.addActionListener(e -> {
                JOptionPane.showMessageDialog(null, label.getText(), "Titulo", 2);
        });

        JTextArea textArea = new JTextArea("Hoje esta sendo um dia frio e ensolarado!!");
        JTextArea textArea1 = new JTextArea("Hoje esta sendo um dia frio e ensolarado!!");

        JPanel formPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        formPanel.add(label);
        formPanel.add(textField);

        panel.add(formPanel, BorderLayout.NORTH);
        panel.add(button, BorderLayout.SOUTH);
        panel.add(textArea, BorderLayout.EAST);
        panel.add(textArea1, BorderLayout.WEST);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //JOptionPane.showMessageDialog(null, "Mensagem", "Titulo", 2);

    }
}
