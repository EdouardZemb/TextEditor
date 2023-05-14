package editor;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TextEditor extends JFrame {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    private static final String FRAME_NAME = "TextEditorFrame";
    private static final String FRAME_TITLE = "Text Editor";
    private static final String TEXT_AREA_NAME = "TextArea";
    private static final String TEXT_AREA_SCROLL_PANE_NAME = "TextAreaScrollPane";
    private static final int TEXT_AREA_MARGIN = 10;

    public TextEditor() {
        setName(FRAME_NAME);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle(FRAME_TITLE);

        add(createTextAreaScrollPane(), BorderLayout.CENTER);

        setVisible(true);
    }

    private JScrollPane createTextAreaScrollPane() {
        JTextArea textArea = createTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setName(TEXT_AREA_SCROLL_PANE_NAME);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        textArea.setBorder(new EmptyBorder(TEXT_AREA_MARGIN, TEXT_AREA_MARGIN, TEXT_AREA_MARGIN, TEXT_AREA_MARGIN));

        scrollPane.setVisible(true);
        return scrollPane;
    }

    private JTextArea createTextArea() {
        JTextArea textArea = new JTextArea();
        textArea.setName(TEXT_AREA_NAME);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        return textArea;
    }
}
