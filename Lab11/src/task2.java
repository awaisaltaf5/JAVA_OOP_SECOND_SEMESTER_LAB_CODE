import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class task2 extends JFrame {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Task 2");
        frame.setSize(600,300);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        JTextField field=new JTextField("Default Text");
        field.setSize(100,40);
        JLabel label=new JLabel("Label");
        JButton button=new JButton("Display");
        button.setSize(100,50);
        frame.add(field);
        frame.add(button);  
        frame.add(label);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Welcome "+field.getText()+" Again in Numl!");
            }
        });

    }
}
