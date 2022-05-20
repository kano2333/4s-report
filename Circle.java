package report1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Circle extends Figure{
	int size;
	int i=0;
	int k=0;
	Circle(){
	}
	@Override public void paint(Graphics g) {
		i=i+10;
		Graphics2D g2=(Graphics2D)g;
		AffineTransform af=g2.getTransform();
		af.setToRotation(Math.toRadians(i),x-20,y-20);
		
		g2.setTransform(af);
		g2.drawOval(x,y,100,100);
		g2.drawRect(x,y,70,70);
		g2.fillRect(x,y,70,70);
	}
}
