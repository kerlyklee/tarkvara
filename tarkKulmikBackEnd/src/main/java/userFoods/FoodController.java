package app.userFoods;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

	private FoodService foodService;
	
	public FoodController(FoodService foodService) {
		this.foodService = foodService;
	}
	
	
	@RequestMapping(value="/foods/add", method=RequestMethod.POST,
			consumes = "application/json")
	public Food addFood(@RequestBody Food food) {
		return foodService.addFood(food);
	}
	
	@RequestMapping(value="/foods", method=RequestMethod.GET)
	public List<Food> getAllFoods() {
		return foodService.getAllFoods();
	}
	
	@RequestMapping(value = "/foods/{id}", method=RequestMethod.GET)
	public Food getFood(@PathVariable("id") long foodId) {
		return foodService.getFoodById(foodId);
}
}
