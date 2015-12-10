package testProject;

public class Main {
	public static void main(String[] args){
		Taco myTaco = new Taco();
		Taco yourTaco = new Taco();
		Taco thisisaTaco = new Taco();
		
		myTaco.AddTopping("lettuce", 0.10f);
		myTaco.AddTopping("meat", 1.00f);
		//myTaco.AddTopping("cheese");
		myTaco.AddTopping("hot sauce", 0.10f);
		thisisaTaco.AddTopping("cheese", 1.20f);

		yourTaco = myTaco.Clone();
		yourTaco.RemoveTopping("hot sauce");

		System.out.println(myTaco.ShowTacoCost());
		System.out.println(yourTaco.ShowTacoCost());
        System.out.println(thisisaTaco.ShowTacoCost());
		
        System.out.println(myTaco.LogTime());
	}
}
