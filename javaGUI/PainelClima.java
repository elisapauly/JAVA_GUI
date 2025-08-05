import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.imageio.ImageIO;

public class PainelClima {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(PainelClima::criarJanela);
    }

    public static void criarJanela() {
        JFrame frame = new JFrame("Painel do Clima - Santa Catarina");
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel painelPrincipal = new JPanel() {
            BufferedImage background;
            {
                try {
                    background = ImageIO.read(new File("clima_background.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (background != null) {
                    g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };

        painelPrincipal.setLayout(null);

        JLabel labelDia = new JLabel("04", SwingConstants.CENTER);
        labelDia.setFont(new Font("SansSerif", Font.BOLD, 48));
        labelDia.setBounds(70, 40, 100, 50);

        JLabel labelMesAno = new JLabel("AGOSTO - 2025", SwingConstants.CENTER);
        labelMesAno.setFont(new Font("SansSerif", Font.PLAIN, 16));
        labelMesAno.setBounds(50, 90, 140, 30);

        JPanel blocoData = new JPanel(null);
        blocoData.setBackground(Color.WHITE);
        blocoData.setBounds(50, 30, 180, 100);
        blocoData.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        blocoData.add(labelDia);
        blocoData.add(labelMesAno);

        JPanel painelRodape = new JPanel(null);
        painelRodape.setBounds(300, 600, 600, 100);
        painelRodape.setBackground(new Color(210, 220, 240));
        painelRodape.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

        JLabel localLabel = new JLabel("SEU LOCAL - JOINVILLE, SC");
        localLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
        localLabel.setBounds(20, 10, 400, 20);

        JLabel dataLabel = new JLabel("SEGUNDA-FEIRA, 04 DE AGOSTO DE 2025");
        dataLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));
        dataLabel.setBounds(20, 30, 400, 20);

        JLabel climaLabel = new JLabel("\u26C8  21°C - 15°C", SwingConstants.RIGHT);
        climaLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));
        climaLabel.setBounds(400, 10, 180, 30);

        painelRodape.add(localLabel);
        painelRodape.add(dataLabel);
        painelRodape.add(climaLabel);

        JTextField campoBusca = new JTextField();
        campoBusca.setFont(new Font("SansSerif", Font.PLAIN, 14));
        campoBusca.setBounds(400, 720, 250, 30);

        JButton botaoBusca = new JButton("Buscar");
        botaoBusca.setBounds(660, 720, 80, 30);

        JLabel resultadoLabel = new JLabel("", SwingConstants.LEFT);
        resultadoLabel.setBounds(750, 720, 300, 30);
        resultadoLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        resultadoLabel.setForeground(Color.BLUE);

        botaoBusca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cidade = campoBusca.getText().trim().toLowerCase();
                if (cidade.equals("joinville")) {
                    resultadoLabel.setText("Clima: ☀️ 25°C - 18°C");
                } else if (cidade.equals("florianópolis")) {
                    resultadoLabel.setText("Clima: ⛅ 22°C - 17°C");
                } else if (cidade.equals("blumenau")) {
                    resultadoLabel.setText("Clima: 🌧️ 20°C - 16°C");
                    } else if (cidade.equals("campo alegre")) {
                    resultadoLabel.setText("Clima: 🌧️ 20°C - 16°C");
                    } else if (cidade.equals("mafra")) {
                    resultadoLabel.setText("Clima: 🌧️ 15°C - 16°C");
                    } else if (cidade.equals("balneário camburiú")) {
                    resultadoLabel.setText("Clima: 🌧️ 17°C - 20°C");
                    } else if (cidade.equals("são joaquim")) {
                    resultadoLabel.setText("Clima: 🌧️ 0°C - 4°C");
                } else {
                    resultadoLabel.setText("Cidade não encontrada.");
                }
            }
        });

        painelPrincipal.add(blocoData);
        painelPrincipal.add(painelRodape);
        painelPrincipal.add(campoBusca);
        painelPrincipal.add(botaoBusca);
        painelPrincipal.add(resultadoLabel);

        frame.setContentPane(painelPrincipal);
        frame.setVisible(true);
    }

    private static JLabel criarImagemRedimensionada(String caminho, int largura, int altura) {
        try {
            BufferedImage imagem = ImageIO.read(new File(caminho));
            Image imagemRedimensionada = imagem.getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
            return new JLabel(new ImageIcon(imagemRedimensionada));
        } catch (IOException e) {
            e.printStackTrace();
            return new JLabel("Imagem não encontrada: " + caminho);
        }
    }
}
