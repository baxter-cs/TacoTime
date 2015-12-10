package testProject;

public class Main {
	public static void main(String[] args){
		Taco myTaco = new Taco();
		Taco yourTaco = new Taco();

		
		myTaco.AddTopping("lettuce");
		myTaco.AddTopping("meat");
		myTaco.AddTopping("cheese");
		myTaco.AddTopping("hot sauce");
		

		yourTaco = myTaco.Clone();
		yourTaco.RemoveTopping("hot sauce");
		
		yourTaco.RemoveTopping("lettuce");

		System.out.println(myTaco.ShowTacoCost());
		System.out.println(yourTaco.ShowTacoCost());
        
        System.out.println(myTaco.LogTime());
	}
}
