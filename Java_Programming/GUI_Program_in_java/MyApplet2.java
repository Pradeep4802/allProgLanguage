import java.applet.Applet;
import java.awt.*;
/* <applet code="MyApplet2" width="300" height="220">
	<param name="site" value="www.mysirg.com"/>
   </applet> */
public class MyApplet2 extends Applet {
	private String defaultMessage = "Hello!!";
	
	public void paint (Graphics g)
	{
		String s1 = this.getParameter("site");
		if (s1 == null)
			s1 = defaultMessage;
		
		g.drawString(s1, 50, 25);
		
	}
}