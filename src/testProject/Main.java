package testProject;

public class Main {
	public static void main(String[] args){
		Taco myTaco = new Taco();
		Taco yourTaco = new Taco();
		Taco thisisaTaco = new Taco();
		
		myTaco.AddTopping("lettuce");
		myTaco.AddTopping("meat");
		myTaco.AddTopping("cheese");
		myTaco.AddTopping("hot sauce");
		thisisaTaco.AddTopping("cheese");

		yourTaco = myTaco.Clone();
		yourTaco.RemoveTopping("hot sauce");

		System.out.println(myTaco.ShowTacoCost());
		System.out.println(yourTaco.ShowTacoCost());
        System.out.println(thisisaTaco.ShowTacoCost());
		
        System.out.println(myTaco.LogTime());
	}
}
