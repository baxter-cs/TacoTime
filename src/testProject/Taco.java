package testProject;

import java.util.*;
import java.text.SimpleDateFormat;

public class Taco {
	
	
	Map<String, Number> toppings = new HashMap<String, Number>();
	
	
	public void AddTopping(String toppingName) {
		float cost = 0.00f;
		switch (toppingName) {
			case "lettuce":
				cost = 0.10f;
				break;
			case "meat":
				cost = 1.00f;
				break;
			case "cheese":
				cost = 1.20f;
				break;
			case "hot sauce":
				cost = 0.10f;
				break;
			default:
				cost = 12.34f;
				break;
		}
		toppings.put(toppingName, cost);
	}

	
	public void RemoveTopping(String toppingName) {
		toppings.remove(toppingName);
	}
	
	
	public Taco Clone() {
		Taco outTaco = new Taco();
		
		for(String topping: toppings.keySet()){
			outTaco.AddTopping(topping);
		}
		
		return outTaco;
		
	}
	
	
	public String ShowToppings() {
		String outString = "";
		for (String topping : toppings.keySet()){
			if(outString != "") {
				outString += "\n";
			}
			outString += topping;
		}
		return outString;
	}
	
	
	public float ShowTacoCost() {
		float totalCost = 0f;
		
		for(Number cost: toppings.values()){
			totalCost += (float) cost;
		}
		return totalCost;
	}
    
	
    public String LogTime(){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return "Taco made fresh at: " + dateFormat.format(cal.getTime()) + "with some possible human bits thrown in.";
    }
    
    
}
