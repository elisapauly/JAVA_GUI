import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main {
    public static void main(String[] args){
        // componente JFrame
        JFrame miJFrame = new JFrame("Exemplo - Java Swing");
        miJFrame.setSize(500,300);

        // componente JPanel
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);
        
        // usamos para centralizar os componentes de JPanel
        miJPanel.setLayout(new GridBagLayout());

        // componente JTextField
        JLabel miJLabel = new JLabel();
        miJLabel.setText("Diga-me a sua opinião sobre Java Swing: ");
        
        // componente JTextArea
        JTextArea miJTextArea = new JTextArea(5,20);

        // conecta os componentes JLabel e JTextField em JPanel
        miJPanel.add(miJLabel); miJPanel.add(miJTextArea);

        // conectar JPanel a JFrame
        miJFrame.add(miJPanel);

        // tornar visível JFrame
        miJFrame.setVisible(true);
    }
}
