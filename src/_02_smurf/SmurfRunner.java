package _02_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Smurf HandySmurf = new Smurf("HandySmurf");
		Smurf PapaSmurf = new Smurf("PapaSmurf");
		Smurf Smurfette = new Smurf("Smurfette");
		
		HandySmurf.eat();
		HandySmurf.getName();
		
		PapaSmurf.getName();
		PapaSmurf.isGirlOrBoy();
		
		Smurfette.getName();
		Smurfette.getHatColor();
		Smurfette.isGirlOrBoy();
	}

}
