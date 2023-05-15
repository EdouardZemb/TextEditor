package editor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class FilenamePanel {
    private static final String LABEL_TEXT = "Filename: ";

    private JPanel panel;
    private JLabel filenameLabel;
    private JTextField filenameField;
    private FilenameButtonPanel buttonPanel;

    public FilenamePanel() {
        createComponents();
        layoutComponents();
    }

    private void createComponents() {
        panel = new JPanel();
        filenameLabel = new JLabel(LABEL_TEXT);
        filenameField = new JTextField();
        buttonPanel = new FilenameButtonPanel();
    }

    private void layoutComponents() {
        panel.setLayout(new BorderLayout());
        panel.add(filenameLabel, BorderLayout.WEST);
        panel.add(filenameField, BorderLayout.CENTER);
        panel.add(buttonPanel.getComponent(), BorderLayout.EAST);
    }

    public JComponent getComponent() {
        return panel;
    }

    public String getFilename() {
        return filenameField.getText();
    }

    public void addSaveButtonListener(ActionListener listener) {
        buttonPanel.addSaveButtonListener(listener);
    }

    public void addLoadButtonListener(ActionListener listener) {
        buttonPanel.addLoadButtonListener(listener);
    }
}