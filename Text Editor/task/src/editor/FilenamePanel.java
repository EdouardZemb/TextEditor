package editor;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class FilenamePanel extends JPanel {
    private static final String LABEL_TEXT = "Filename:";
    private static final String LABEL_NAME = "FilenameLabel";
    private static final String TEXT_FIELD_NAME = "FilenameField";
    private static final int PANEL_MARGIN = 10;

    public FilenamePanel() {
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(PANEL_MARGIN, PANEL_MARGIN, PANEL_MARGIN, PANEL_MARGIN));

        addFilenameLabel();
        addFilenameField();
        addFilenameButtonPanel();
    }

    private void addFilenameLabel() {
        JLabel filenameLabel = new JLabel(LABEL_TEXT);
        filenameLabel.setName(LABEL_NAME);
        add(filenameLabel, BorderLayout.WEST);
    }

    private void addFilenameField() {
        JTextField filenameField = new JTextField();
        filenameField.setName(TEXT_FIELD_NAME);
        add(filenameField, BorderLayout.CENTER);
    }

    private void addFilenameButtonPanel() {
        FilenameButtonPanel buttonPanel = new FilenameButtonPanel();
        add(buttonPanel, BorderLayout.EAST);
    }
}
