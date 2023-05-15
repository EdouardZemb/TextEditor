package editor;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class FilenamePanel extends JPanel {
    private static final String LABEL_TEXT = "Filename:";
    private static final String LABEL_NAME = "FilenameLabel";
    private static final String TEXT_FIELD_NAME = "FilenameField";
    private static final String SAVE_BUTTON_TEXT = "Save";
    private static final String SAVE_BUTTON_NAME = "SaveButton";
    private static final String LOAD_BUTTON_TEXT = "Load";
    private static final String LOAD_BUTTON_NAME = "LoadButton";
    private static final int PANEL_MARGIN = 10;

    public FilenamePanel() {
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(PANEL_MARGIN, PANEL_MARGIN, PANEL_MARGIN, PANEL_MARGIN));

        JLabel filenameLabel = new JLabel(FilenamePanel.LABEL_TEXT);
        filenameLabel.setName(FilenamePanel.LABEL_NAME);
        add(filenameLabel, BorderLayout.WEST);

        JTextField filenameField = new JTextField();
        filenameField.setName(TEXT_FIELD_NAME);
        add(filenameField, BorderLayout.CENTER);

        JPanel buttonPanel = createFilenameButtonPanel();
        add(buttonPanel, BorderLayout.EAST);
    }

    private JPanel createFilenameButtonPanel() {
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));

        JButton saveButton = new JButton(FilenamePanel.SAVE_BUTTON_TEXT);
        saveButton.setName(FilenamePanel.SAVE_BUTTON_NAME);
        buttonPanel.add(saveButton);

        JButton loadButton = new JButton(FilenamePanel.LOAD_BUTTON_TEXT);
        loadButton.setName(FilenamePanel.LOAD_BUTTON_NAME);
        buttonPanel.add(loadButton);

        return buttonPanel;
    }
}
