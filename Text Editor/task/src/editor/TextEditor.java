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
        setName(FRAME_NAME);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle(FRAME_TITLE);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(new EmptyBorder(TEXT_AREA_MARGIN, TEXT_AREA_MARGIN, TEXT_AREA_MARGIN, TEXT_AREA_MARGIN));
        panel.add(new FilenamePanel(), BorderLayout.NORTH);
        panel.add(new TextAreaPanel(), BorderLayout.CENTER);

        getContentPane().add(panel, BorderLayout.CENTER);

        setVisible(true);
    }
}
