package RestaurantView;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import model.Model;

public class ResPanel extends JPanel{
	
	private Model model;
	
	public ResPanel(Model model) {
		this.model = model;
	}
	
	public void drawScene(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, ResFrame.WIDTH, ResFrame.HEIGHT);
		
		if(model.getKitchen() != null) {
			g.setColor(Color.RED);
			g.fillRect(10, 10, 400, 150);
		}
		
		if(model.getBar() != null) {
			g.setColor(Color.RED);
			g.fillRect(ResFrame.WIDTH-10-200, 10, 200, 100);
		}
	}
	
	
	public void paint (Graphics g) {
		drawScene(g);
	}

}
