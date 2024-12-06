import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabTask2 extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Temperature Converter");
        frame.setSize(300, 250);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding between components

        // Labels and text fields
        JLabel celsiusLabel = new JLabel("Celsius:");
        JTextField celsiusField = new JTextField(5); // Set text field size to 5 columns

        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
        JTextField fahrenheitField = new JTextField(5); // Set text field size to 5 columns

        JLabel kelvinLabel = new JLabel("Kelvin:");
        JTextField kelvinField = new JTextField(5); // Set text field size to 5 columns
        kelvinField.setEditable(false); // Make the output field read-only

        // Convert button
        JButton convertButton = new JButton("Convert");
        convertButton.setPreferredSize(new Dimension(100, 40)); // Set the size of the button

        // Set layout constraints for components
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(celsiusLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(celsiusField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(fahrenheitLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(fahrenheitField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(kelvinLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        frame.add(kelvinField, gbc);

        // Add the Convert button at the bottom and center it
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2; // Make the button span across both columns
        gbc.anchor = GridBagConstraints.CENTER; // Center the button
        frame.add(convertButton, gbc);

        // Action listener for the Convert button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = 0, fahrenheit = 0;

                    // If Celsius field has a value, convert it
                    if (!celsiusField.getText().isEmpty()) {
                        celsius = Double.parseDouble(celsiusField.getText());
                        fahrenheitField.setText(""); // Clear Fahrenheit field if Celsius is used
                        kelvinField.setText(String.format("%.2f", celsius + 273.15)); // Convert to Kelvin
                    }
                    // If Fahrenheit field has a value, convert it
                    else if (!fahrenheitField.getText().isEmpty()) {
                        fahrenheit = Double.parseDouble(fahrenheitField.getText());
                        celsiusField.setText(""); // Clear Celsius field if Fahrenheit is used
                        kelvinField.setText(String.format("%.2f", (fahrenheit - 32) * 5/9 + 273.15)); // Convert to Kelvin
                    } else {
                        kelvinField.setText("Please enter a value");
                    }

                } catch (NumberFormatException ex) {
                    kelvinField.setText("Invalid Input");
                }
            }
        });

        // Set default behavior for closing the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
