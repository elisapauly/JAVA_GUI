import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class PainelClima {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PainelClima::criarJanela);
    }

    public static void criarJanela() {
        JFrame frame = new JFrame("Painel do Clima - Santa Catarina");
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setBackground(new Color(229, 233, 240));

        JLabel labelDia = new JLabel("04", SwingConstants.CENTER);
        labelDia.setFont(new Font("SansSerif", Font.BOLD, 40));
        labelDia.setBounds(50, 30, 100, 50);

        JLabel labelMesAno = new JLabel("AGOSTO - 2025", SwingConstants.CENTER);
        labelMesAno.setFont(new Font("SansSerif", Font.PLAIN, 16));
        labelMesAno.setBounds(30, 70, 140, 30);

        JPanel blocoData = new JPanel();
        blocoData.setLayout(null);
        blocoData.setBackground(Color.WHITE);
        blocoData.setBounds(30, 20, 180, 100);
        blocoData.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        blocoData.add(labelDia);
        blocoData.add(labelMesAno);

        JTextField campoBusca = new JTextField("PESQUISE UM LOCAL...");
        campoBusca.setFont(new Font("SansSerif", Font.PLAIN, 14));
        campoBusca.setBounds(530, 710, 300, 30);

        JPanel painelRodape = new JPanel(null);
        painelRodape.setBounds(480, 650, 600, 100);
        painelRodape.setBackground(new Color(210, 220, 240));
        painelRodape.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

        JLabel localLabel = new JLabel("SEU LOCAL - JOINVILLE, SC", SwingConstants.LEFT);
        localLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
        localLabel.setBounds(80, 10, 400, 20);

        JLabel dataLabel = new JLabel("SEGUNDA - FEIRA, 04 DE AGOSTO DE 2025", SwingConstants.LEFT);
        dataLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));
        dataLabel.setBounds(80, 30, 400, 20);

        JLabel climaLabel = new JLabel("\u26C8  21°C - 15°C", SwingConstants.RIGHT);
        climaLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));
        climaLabel.setBounds(450, 10, 150, 30);

        painelRodape.add(localLabel);
        painelRodape.add(dataLabel);
        painelRodape.add(climaLabel);
        painelRodape.add(campoBusca);

        painelPrincipal.add(blocoData);
        painelPrincipal.add(painelRodape);

        frame.add(painelPrincipal);
        frame.setVisible(true);
    }
}

