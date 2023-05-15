package editor;

import javax.swing.*;
import java.awt.*;

public class FilenameButtonPanel extends JPanel {
    private static final String SAVE_BUTTON_TEXT = "Save";
    private static final String SAVE_BUTTON_NAME = "SaveButton";
    private static final String LOAD_BUTTON_TEXT = "Load";
    private static final String LOAD_BUTTON_NAME = "LoadButton";

    public FilenameButtonPanel() {
        setLayout(new GridLayout(1, 2));

        JButton saveButton = createSaveButton();
        add(saveButton);

        JButton loadButton = createLoadButton();
        add(loadButton);
    }

    private JButton createSaveButton() {
        JButton saveButton = new JButton(SAVE_BUTTON_TEXT);
        saveButton.setName(SAVE_BUTTON_NAME);
        return saveButton;
    }

    private JButton createLoadButton() {
        JButton loadButton = new JButton(LOAD_BUTTON_TEXT);
        loadButton.setName(LOAD_BUTTON_NAME);
        return loadButton;
    }
}
