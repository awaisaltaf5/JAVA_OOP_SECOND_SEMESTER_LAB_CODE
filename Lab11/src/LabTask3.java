import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LabTask3 extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 250);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding between components
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Labels
        JLabel label1 = new JLabel("Enter first number");
        JLabel label2 = new JLabel("Enter second number");

        // Text fields
        JTextField field1 = new JTextField(10);
        JTextField field2 = new JTextField(10);

        // Buttons
        JButton multiplyButton = new JButton("Multiply");
        JButton subButton = new JButton("Subtract");

        // Result label
        JLabel resultLabel = new JLabel("Result = 0");

        // First row
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(label1, gbc);
        gbc.gridx = 1;
        frame.add(field1, gbc);

        // Second row
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(label2, gbc);
        gbc.gridx = 1;
        frame.add(field2, gbc);

        // Third row (Buttons)
        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(multiplyButton, gbc);
        gbc.gridx = 1;
        frame.add(subButton, gbc);

        // Fourth row (Result label)
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2; // Span across both columns
        frame.add(resultLabel, gbc);

        // Action listener for the Multiply button
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(field1.getText());
                    int n2 = Integer.parseInt(field2.getText());
                    int n3 = n1 * n2;
                    resultLabel.setText("Result = " + n3); // Update label with multiplication result
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        });

        // Action listener for the Subtract button
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(field1.getText());
                    int n2 = Integer.parseInt(field2.getText());
                    int n3 = n1 - n2;
                    resultLabel.setText("Result = " + n3); // Update label with subtraction result
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
