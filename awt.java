import java.awt.*;
import java.awt.event.*;

public class awt {
    public static void main(String[] args) {

        Frame f = new Frame("AWT Login Form");

        // Labels
        Label l1 = new Label("Enter Name:");
        Label l2 = new Label("Enter Password:");
        Label result = new Label(); // for output

        // TextFields
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        t2.setEchoChar('*'); // hide password

        // Button
        Button b1 = new Button("Submit");

        // Layout
        f.setLayout(null);
        f.setSize(300, 400);

        // Set Positions
        l1.setBounds(50, 50, 120, 30);
        t1.setBounds(150, 50, 120, 30);

        l2.setBounds(50, 100, 120, 30);
        t2.setBounds(150, 100, 120, 30);

        b1.setBounds(100, 150, 100, 30);

        result.setBounds(50, 200, 200, 30);

        // Add Components
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(result);

        // Button Click Event
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
                String password = t2.getText();

                if (name.equals("girish") && password.equals("1234")) {
                    result.setText("Login Successful");
                } else {
                    result.setText("Invalid Username or Password");
                }
            }
        });

        // Close Window Properly
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        // Show Frame
        f.setVisible(true);
    }
}