package editor;

import javax.swing.*;

public class ApplicationRunner {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TextEditor textEditor = new TextEditor();
            textEditor.run();
        });
    }
}
