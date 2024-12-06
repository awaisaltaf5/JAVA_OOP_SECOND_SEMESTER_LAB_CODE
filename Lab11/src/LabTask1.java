import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabTask1 extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 200);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Add padding around components
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Labels
        JLabel label1 = new JLabel("Enter first number");
        JLabel label2 = new JLabel("Enter second number");

        // Text fields
        JTextField field1 = new JTextField(10);
        JTextField field2 = new JTextField(10);

        // Button
        JButton button = new JButton("Add");

        // Result label
        JLabel resultLabel = new JLabel(" ");

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

        // Third row
        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(button, gbc);

        gbc.gridx = 1;
        frame.add(resultLabel, gbc);

        // Action listener for button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(field1.getText());
                    int n2 = Integer.parseInt(field2.getText());
                    int sum = n1 + n2;
                    resultLabel.setText(String.valueOf(sum));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
