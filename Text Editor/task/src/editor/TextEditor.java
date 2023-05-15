package editor;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextEditor {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    private static final String FRAME_TITLE = "Text Editor";
    private static final int MARGIN = 10;

    private JFrame frame;
    private FilenamePanel filenamePanel;
    private TextAreaPanel textAreaPanel;

    public TextEditor() {
    }

    public JFrame run() {
        createFrame();
        createContent();
        frame.setVisible(true);
        return frame;
    }

    private void createFrame() {
        frame = new JFrame(FRAME_TITLE);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createContent() {
        JPanel contentPanel = new JPanel(new BorderLayout());
        filenamePanel = new FilenamePanel();
        textAreaPanel = new TextAreaPanel();
        filenamePanel.addSaveButtonListener(e -> {
            String text = getTextAreaText();
            String filename = getFilename();
            saveTextToFile(text, filename);
        });
        filenamePanel.addLoadButtonListener(e -> {
            String filename = getFilename();
            String text = loadTextFromFile(filename);
            textAreaPanel.setText(text);
        });
        contentPanel.add(filenamePanel.getComponent(), BorderLayout.NORTH);
        contentPanel.add(textAreaPanel.getComponent(), BorderLayout.CENTER);
        contentPanel.setBorder(new EmptyBorder(MARGIN, MARGIN, MARGIN, MARGIN));
        frame.setContentPane(contentPanel);
    }

    private String loadTextFromFile(String filename) {
        String workingDir = System.getProperty("user.dir");
        String folderPath = workingDir + File.separator + "Text Editor" + File.separator + "task" + File.separator + "src";
        String filePath = folderPath + File.separator + filename;

        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("No file found: " + filePath);
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        try (java.util.Scanner scanner = new java.util.Scanner(file)) {
            while (scanner.hasNext()) {
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + filePath);
        }
        return stringBuilder.toString();
    }

    private String getTextAreaText() {
        return textAreaPanel.getText();
    }

    private String getFilename() {
        return filenamePanel.getFilename();
    }

    private void saveTextToFile(String text, String filename) {
        String workingDir = System.getProperty("user.dir");
        String folderPath = workingDir + File.separator + "Text Editor" + File.separator + "task" + File.separator + "src";
        String filePath = folderPath + File.separator + filename + ".txt";

        File directory = new File(folderPath);
        if (!directory.exists()) {
            boolean created = directory.mkdirs();
            if (!created) {
                System.out.println("Failed to create directory: " + folderPath);
                return;
            }
        }

        try (PrintWriter printWriter = new PrintWriter(filePath)) {
            printWriter.print(text);
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + filePath);
        }
    }
}