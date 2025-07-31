import java.awt.*;
import javax.swing.*;

public class hoje {
    
    public static void main(String[] args) {
      
        JFrame frame = new JFrame(" .*.*.* HOJE .*.*.*");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setLayout(new BorderLayout());

        

        frame.setVisible(true);

    }
}

