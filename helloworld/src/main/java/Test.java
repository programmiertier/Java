import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String args[]){
            System.out.print("Hello World");


        JFrame window = new JFrame();
        window.setTitle("Hallo");

        window.setLayout(new BorderLayout());

        JLabel label = new JLabel();
        label.setText("Hello, World");
        window.getContentPane().add(label, BorderLayout.EAST);

        window.setSize(400,300);
        window.setVisible(true);
    }
}
