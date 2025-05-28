import java.awt.*;
import java.awt.event.*;

public class Set {
    public static void main(String[] args) {
        Frame frame = new Frame("jonathorz");
        Label label = new Label("Hello World!");
        Button button = new Button("bruh");

        // Aligning the label to CENTER
        label.setAlignment(Label.CENTER);

        // Adding Label and Setting
        // the Size of the Frame
        frame.add(label);
        frame.add(button);
        frame.setSize(400, 300);
        button.setSize(100, 100);

        // Making the Frame visible
        frame.setVisible(true);

        // Using WindowListener for closing the window
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setResizable(false);
    }
}