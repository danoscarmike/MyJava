import javax.swing.*;

class Radios extends JFrame {
    JPanel pnl = new JPanel();
    JRadioButton rad1 = new JRadioButton("Red", true);
    JRadioButton rad2 = new JRadioButton("Rose");
    JRadioButton rad3 = new JRadioButton("White");
    ButtonGroup wines = new ButtonGroup();
    JSlider sldr1 = new JSlider(1);

    public Radios() {
        super("Swing Window");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        wines.add(rad1);
        wines.add(rad2);
        wines.add(rad3);
        add(pnl);
        pnl.add(rad1);
        pnl.add(rad2);
        pnl.add(rad3);
        pnl.add(sldr1);
        sldr1.createStandardLabels(10);
        sldr1.setMajorTickSpacing(10);
        sldr1.setToolTipText(Integer.toString(sldr1.getValue()));
        sldr1.setPaintLabels(true);
        sldr1.setPaintTicks(true);
        sldr1.setPaintTrack(true);
        setVisible(true);
    }
    public static void main(String[] args) {
        Radios gui = new Radios();        
    }
}