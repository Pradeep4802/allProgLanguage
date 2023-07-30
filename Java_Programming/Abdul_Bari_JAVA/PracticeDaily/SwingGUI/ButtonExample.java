import javax.swing.*;

public class ButtonExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Buttom Example");
        JButton b = new JButton();
        b.setText("Click here11");
        b.setBounds(100,100,95,30);
        f.add(b);
        f.setSize(450,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
