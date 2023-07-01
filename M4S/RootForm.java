package M4S;

import javax.swing.*;
import java.awt.*;

public class RootForm extends JFrame {
    private JPanel rootPanel;

    public RootForm(){
        setContentPane(rootPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640,480);
        setVisible(true);
    }
}
