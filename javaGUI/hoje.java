import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javafx.event.ActionEvent;

public class hoje {
    
    public static void main(String[] args) {
      
        JFrame frame = new JFrame(" ☀️ .*.*.* CLIMA HOJE .*.*.* ☁️");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel painelImagem = new JPanel();
        painelImagem.setBackground(new Color(135, 206, 235));
        painelImagem.setPreferredSize(new Dimension(2000, 2000));

        ImageIcon imgCima = new ImageIcon("clima1.png");
        Image cima = imgCima.getImage().getScaledInstance(250, 190, Image.SCALE_SMOOTH);
        JLabel labelCima = new JLabel(new ImageIcon(cima));
        labelCima.setHorizontalAlignment(JLabel.CENTER);
        painelImagem.add(labelCima, BorderLayout.NORTH);

        ImageIcon imagemOriginal = new ImageIcon("clima.png");
        Image imagemRedimensionada = imagemOriginal.getImage().getScaledInstance(250, 190, Image.SCALE_SMOOTH);
        JLabel imagemLabel = new JLabel( new ImageIcon (imagemRedimensionada));
        imagemLabel.setHorizontalAlignment(JLabel.CENTER);
        painelImagem.add(imagemLabel, BorderLayout.CENTER);

        ImageIcon imgBaixo = new ImageIcon("clima2.png");
        Image baixo = imgBaixo.getImage().getScaledInstance(250, 190, Image.SCALE_SMOOTH);
        JLabel labelBaixo = new JLabel(new ImageIcon(baixo));
        labelBaixo.setHorizontalAlignment(JLabel.CENTER);
        painelImagem.add(labelBaixo, BorderLayout.SOUTH);

        painelImagem.setLayout(new GridBagLayout());
        painelImagem.add(imagemLabel);

        JButton button = new JButton("🌤️Ver o clima de hoje   🌡️");
        button.setBackground(new Color(30, 144, 255));
        button.setForeground(Color.white);
        button.setFocusPainted(false); //remove o contorno do clique
        button.setFont(new Font("Segoe UI Emoji", Font.BOLD, 16));
        button.setPreferredSize(new Dimension(200, 50));

        JLabel label = new JLabel("Digite seu local: ");
        label.setFont(new Font("Serif", Font.BOLD, 36));

        //ação quando clica no botão

        button.addActionListener(e -> {
                JOptionPane.showMessageDialog(frame, "Hoje esta ensolarado ☀️ com 27°C 🌡️", "Clima", JOptionPane.INFORMATION_MESSAGE);
        });

        JTextArea climaTexto = new JTextArea("Hoje esta sendo um dia frio e ensolarado!!");
        climaTexto.setEditable(false);
        climaTexto.setLineWrap(true);
        climaTexto.setWrapStyleWord(true);
        climaTexto.setFont(new Font("Arial", Font.PLAIN, 14));
        climaTexto.setBackground(Color.WHITE);
        climaTexto.setMargin(new Insets(10, 10, 10, 10));
        climaTexto.setPreferredSize(new Dimension(200, 100));
    
        frame.add(panel);
        frame.setVisible(true);
        panel.add(climaTexto, BorderLayout.EAST);
        panel.add(button, BorderLayout.SOUTH);
        panel.add(painelImagem, BorderLayout.WEST);
        
    }
}

