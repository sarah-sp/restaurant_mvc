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
		
		g.setColor(Color.RED);
	}
	
	
	public void paint (Graphics g) {
		
	}

}
