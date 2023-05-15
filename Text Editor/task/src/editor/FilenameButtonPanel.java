package editor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class FilenameButtonPanel {
    private static final String SAVE_BUTTON_TEXT = "Save";
    private static final String SAVE_BUTTON_NAME = "SaveButton";
    private static final String LOAD_BUTTON_TEXT = "Load";
    private static final String LOAD_BUTTON_NAME = "LoadButton";

    private JPanel panel;
    private JButton saveButton;
    private JButton loadButton;

    public FilenameButtonPanel() {
        createComponents();
        configureComponents();
        layoutComponents();
    }

    private void configureComponents() {
        saveButton.setName(SAVE_BUTTON_NAME);
        loadButton.setName(LOAD_BUTTON_NAME);
    }

    private void createComponents() {
        panel = new JPanel();
        saveButton = new JButton(SAVE_BUTTON_TEXT);
        loadButton = new JButton(LOAD_BUTTON_TEXT);
    }

    private void layoutComponents() {
        panel.setLayout(new GridLayout(1, 2));
        panel.add(saveButton);
        panel.add(loadButton);
    }

    public JComponent getComponent() {
        return panel;
    }

    public void addSaveButtonListener(ActionListener listener) {
        saveButton.addActionListener(listener);
    }

    public void addLoadButtonListener(ActionListener listener) {
        loadButton.addActionListener(listener);
    }
}
