package _01_sea_creature;

public class SeaCreaturerunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SeaCreature spongebob = new SeaCreature("spongebob");
		SeaCreature patrick = new SeaCreature("patrick");
		SeaCreature squidward = new SeaCreature("squidward");
		
		
		spongebob.eat();
		spongebob.laugh();
		patrick.getName();
		squidward.getName();
		patrick.eat();
		patrick.laugh();
		squidward.eat();
		squidward.laugh();
		
	}

}
