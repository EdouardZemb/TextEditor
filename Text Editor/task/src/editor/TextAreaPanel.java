package editor;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TextAreaPanel extends JPanel {
    private static final String TEXT_AREA_NAME = "TextArea";
    private static final String TEXT_AREA_SCROLL_PANE_NAME = "ScrollPane";
    private static final int TEXT_AREA_MARGIN = 10;

    public TextAreaPanel() {
        setLayout(new BorderLayout());

        JTextArea textArea = createTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setName(TEXT_AREA_SCROLL_PANE_NAME);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        textArea.setBorder(new EmptyBorder(TEXT_AREA_MARGIN, TEXT_AREA_MARGIN, TEXT_AREA_MARGIN, TEXT_AREA_MARGIN));

        add(scrollPane, BorderLayout.CENTER);
    }

    private JTextArea createTextArea() {
        JTextArea textArea = new JTextArea();
        textArea.setName(TEXT_AREA_NAME);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        return textArea;
    }
}