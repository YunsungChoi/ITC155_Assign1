import java.awt.Color;
import java.awt.Graphics;


public class Duck {

	public static void main(String[] args) {
		
		//create drawingpanel window size 500 x 500 
		DrawingPanel panel = new DrawingPanel ( 500, 500);
		panel.setBackground(Color.YELLOW);
		Graphics g = panel.getGraphics();
		
		//create two blue circle
		g.setColor(Color.blue);
		g.fillOval(150, 200, 50, 50);
		g.fillOval(300, 200, 50, 50);
		
		//create outline for the two blue circle
		g.setColor(Color.BLACK);
		g.drawOval(150, 200, 50, 50);
		g.drawOval(300, 200, 50, 50);
		
		//create a red rectangle
		g.setColor(Color.RED);
		g.fillRect(175, 225, 150, 150);
		
		//create a black line goes across the rectangle
		g.setColor(Color.BLACK);
		g.drawLine(175, 300, 325, 300);
	}

}
