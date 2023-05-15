package editor;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

class TextAreaPanel {
    private static final String TEXT_AREA_NAME = "TextArea";
    private static final String TEXT_AREA_SCROLL_PANE_NAME = "ScrollPane";
    private static final int TEXT_AREA_MARGIN = 10;

    private JPanel panel;
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public TextAreaPanel() {
        createComponents();
        configureComponents();
        layoutComponents();
    }

    private void createComponents() {
        panel = new JPanel();
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
    }
    private void configureComponents() {
        configureTextArea(textArea);
        configureScrollPane(scrollPane);
    }

    private void configureScrollPane(JScrollPane scrollPane) {
        scrollPane.setName(TEXT_AREA_SCROLL_PANE_NAME);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBorder(new EmptyBorder(10, 0, 0, 0));
    }

    private void configureTextArea(JTextArea textArea) {
        textArea.setName(TEXT_AREA_NAME);
        textArea.setBorder(new EmptyBorder(TEXT_AREA_MARGIN, TEXT_AREA_MARGIN, TEXT_AREA_MARGIN, TEXT_AREA_MARGIN));
    }
    private void layoutComponents() {
        panel.setLayout(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);
    }

    public JComponent getComponent() {
        return panel;
    }

    public String getText() {
        return textArea.getText();
    }

    public void setText(String text) {
        textArea.setText(text);
    }
}