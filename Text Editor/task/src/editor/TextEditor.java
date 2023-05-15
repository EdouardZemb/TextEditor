package editor;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TextEditor extends JFrame {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    private static final String FRAME_NAME = "TextEditorFrame";
    private static final String FRAME_TITLE = "Text Editor";
    private static final int TEXT_AREA_MARGIN = 10;

    public TextEditor() {
        configureFrame();
        addContentPanel();
        setVisible(true);
    }

    private void configureFrame() {
        setName(FRAME_NAME);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle(FRAME_TITLE);
    }

    private void addContentPanel() {
        JPanel panel = createContentPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
    }

    private JPanel createContentPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        configureContentPanel(panel);
        addFilenamePanel(panel);
        addTextAreaPanel(panel);
        return panel;
    }

    private void configureContentPanel(JPanel panel) {
        panel.setBorder(new EmptyBorder(TEXT_AREA_MARGIN, TEXT_AREA_MARGIN, TEXT_AREA_MARGIN, TEXT_AREA_MARGIN));
    }

    private void addFilenamePanel(JPanel panel) {
        panel.add(new FilenamePanel(), BorderLayout.NORTH);
    }

    private void addTextAreaPanel(JPanel panel) {
        panel.add(new TextAreaPanel(), BorderLayout.CENTER);
    }
}
