package RestaurantController;

import RestaurantView.RestaurantView;
import model.Model;

public class RestaurantController {
	
	private Model model;
	private RestaurantView resView;
	
	public RestaurantController (Model model, RestaurantView resView) {
		
	}
	
	
	public static void main(String[] args) {
		
		Model m = new Model();
		RestaurantView rv = new RestaurantView(m);
		RestaurantController rc = new RestaurantController(m,rv);
	}

}
