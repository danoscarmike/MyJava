import javax.swing.*;
import java.awt.*;

class Custom extends JFrame {
    JPanel pnl = new JPanel();
    JLabel lbl1 = new JLabel("Custom background color");
    JLabel lbl2 = new JLabel("Custom foreground color");
    JLabel lbl3 = new JLabel("Custom font");

    Color customColor = new Color(0, 255, 0);
    Font customFont = new Font("Monospaced", Font.PLAIN, 48);
    Box box = Box.createVerticalBox();

    public Custom() {
        super("Swing Window");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        lbl1.setOpaque(true);
        lbl1.setBackground(Color.YELLOW);
        lbl2.setForeground(customColor);
        lbl3.setFont(customFont);
        box.add(lbl1); box.add(lbl2); box.add(lbl3);
        pnl.add(box);
        setVisible(true);
    }
    public static void main(String[] args) {
        Custom gui = new Custom();        
    }
}