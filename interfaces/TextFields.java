import java.awt.TextArea;

import javax.swing.*;

class TextFields extends JFrame {
    JPanel pnl = new JPanel();
    JTextField txt1 = new JTextField(72);
    JTextField txt2 = new JTextField("Default text", 72);
    JTextArea txtArea = new JTextArea(5, 70);
    JScrollPane pane = new JScrollPane(txtArea);
    
    public TextFields() {
        super("Swing Window");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        txtArea.setLineWrap(true);
        txtArea.setWrapStyleWord(true);
        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(pnl);
        pnl.add(txt1);
        pnl.add(txt2);
        pnl.add(pane);
        setVisible(true);
    }
    public static void main(String[] args) {
        TextFields gui = new TextFields();        
    }
}