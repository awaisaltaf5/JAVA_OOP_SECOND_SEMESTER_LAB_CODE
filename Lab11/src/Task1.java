import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Task1 extends JFrame {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Task 1");
        frame.setSize(300,300);
        frame.setLayout(new FlowLayout());
        JButton button= new JButton("Click me!");
        button.setSize(800,300);
        JLabel lable=new JLabel("Label");
        lable.setSize(50,100);
        frame.setVisible(true);
        frame.add(button);
        frame.add(lable);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            lable.setText("Text is Change!!");
            }
        });
    }
}
