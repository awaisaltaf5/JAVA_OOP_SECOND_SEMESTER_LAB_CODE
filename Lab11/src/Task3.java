import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task3 extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());

        JTextField field1 = new JTextField(10);
        //field1.setPreferredSize(new Dimension(100, 40)); // Use setPreferredSize instead of setSize
//field1.setSize(100,40);
        JTextField field2 = new JTextField(10);
        //field2.setPreferredSize(new Dimension(100, 40));
//field2.setSize(100,40);
        JButton button = new JButton("Add");
        button.setPreferredSize(new Dimension(100, 60));

        JLabel label = new JLabel("Sum = 0");
        label.setPreferredSize(new Dimension(200, 40)); // Set preferred size for the label

        // Action listener for the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Parsing both fields directly and assuming the input is valid
                int n1 = Integer.parseInt(field1.getText());
                int n2 = Integer.parseInt(field2.getText());
                int n3 = n1 + n2;
                label.setText("Sum = " + n3); // Update label with the sum
            }
        });

        frame.add(field1);
        frame.add(field2);
        frame.add(button);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
