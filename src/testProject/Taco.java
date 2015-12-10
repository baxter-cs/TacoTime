package testProject;

import java.util.*;
import java.text.SimpleDateFormat;

public class Taco {
	Map<String, Number> toppings = new HashMap<String, Number>();
	
	
	public void AddTopping(String toppingName, float cost) {
		toppings.put(toppingName, cost);
	}

	public void RemoveTopping(String toppingName) {
		toppings.remove(toppingName);
	}
	
	
	public Taco Clone() {
		Taco outTaco = new Taco();
		
		for(String topping: toppings.keySet()){
			outTaco.AddTopping(topping, (float) toppings.get(topping));
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
    
	// This is a comment which was not previously there
	
	public String Talk() {
		return "I'm a talking taco";
	}
	
    public String LogTime(){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return "Taco made fresh at: " + dateFormat.format(cal.getTime());
    }
}
