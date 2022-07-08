import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* 
    <applet code = "applet_pract" width = 300 height = 300>
    </applet>
*/
public class applet_pract extends Applet implements ActionListener
{
    String msg = ""; 
    Button b1,b2;
    Label l1=1;
    TextField t1;

    public void init()
    {
        setLayout(null);
        b1 = new Button("Factorial");
        b2 = new Button ("Factorial");
        l1 = new Label("Enter the number : ");
        t1 = new TextField(20);

        add(b1);
        add(b2);
        add(l1);
        add(t1);

        l1.setBounds(40,50,160,30);
        l2.setBounds()
    }
}