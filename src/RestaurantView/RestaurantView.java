package RestaurantView;

import model.Model;

public class RestaurantView {
	
	private ResFrame rFrame;
	private ResPanel rPanel;
	
	public RestaurantView(Model m) {
		
		rFrame = new ResFrame();
		rPanel = new ResPanel(m);
		
		rFrame.init(rPanel);
		
	}

}
