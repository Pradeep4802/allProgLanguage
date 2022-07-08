import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/* <applet code = "App_Fact" width = "300" height = "300" >
    </applet>
*/

public class App_Fact extends Applet {
	String msg = "";
	Label l1, l2;
	TextField t1;
	Button b1, b2;

	public void init() {
		l1 = new Label("Enter the number: ");
		t1 = new TextField();
		b1 = new Button("Factorial");
		b2 = new Button("clear");
		l2 = new Label();

		setLayout(null);
		l1.setBounds(30, 50, 100, 20);
		t1.setBounds(150, 50, 100, 20);
		b1.setBounds(80, 120, 80, 20);
		b2.setBounds(150, 120, 130, 80);
		l2.setBounds(150, 150, 120, 50);

		add(l1);
		add(t1);
		add(b1);
		add(b2);
		add(l2);
		b1.addActionListener(new MyFacto());
		b2.addActionListener(new MyFacto());
	}

	public class MyFacto implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int num;
			String str = e.getActionCommand();
			num = Integer.parseInt(t1.getText());
			if (str.equals("Factorial")) {
				int fact = 1;
				for (int i = 1; i <= num; i++) {
					fact = fact * i;
				}
				// msg = "Factorial is : " + fact;
				l2.setText("Factorial is : " + fact);
			} else if (str.equals("clear")) {
				t1.setText(" ");
			}
			repaint();

		}

		public void paint(Graphics g) {
			g.drawString(msg, 60, 200);
		}

	}
}