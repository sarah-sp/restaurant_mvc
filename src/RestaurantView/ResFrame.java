package RestaurantView;

import java.awt.Container;

import javax.swing.JFrame;

public class ResFrame extends JFrame {
	
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 720;

	public void init(ResPanel rp) {
		this.setTitle("Restaurant Model");
		this.setSize(WIDTH,HEIGHT);
		
		Container c = this.getContentPane();
		c.add(rp);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
