import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Task4 extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());

        JTextField field1 = new JTextField(10); // Set columns for size
        JTextField field2 = new JTextField(10); // Set columns for size

        JButton addButton = new JButton("Add");
        JButton subButton = new JButton("Subtract");

        JLabel label = new JLabel("Result = 0");

        // Action listener for the Add button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(field1.getText());
                int n2 = Integer.parseInt(field2.getText());
                int n3 = n1 + n2;
                label.setText("Result = " + n3); // Update label with the sum
            }
        });

        // Action listener for the Subtract button
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(field1.getText());
                int n2 = Integer.parseInt(field2.getText());
                int n3 = n1 - n2;
                label.setText("Result = " + n3); // Update label with the result of subtraction
            }
        });

        frame.add(field1);
        frame.add(field2);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
