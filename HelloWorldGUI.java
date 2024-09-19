import javax.swing.*;
import javax.swing.text.html.HTMLEditorKit;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HelloWorldGUI {
    public static void main(String[] args) {
        // Create a JFrame (window) with a title
        JFrame frame = new JFrame("Hello World HTML GUI");

        // Create a JEditorPane with HTML content
        JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/html");
        editorPane.setEditable(false);
        editorPane.setEditorKit(new HTMLEditorKit());

        try {
            // Load HTML content from an external file
            String htmlContent = new String(Files.readAllBytes(Paths.get("hello.html")));
            editorPane.setText(htmlContent);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Add the JEditorPane to the content pane of the frame
        frame.getContentPane().add(editorPane);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Make the frame close when the close button is clicked
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
