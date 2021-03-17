package _03_tea_maker;

import _03_tea_maker.Kettle.Water;

public class TeaMakerRunner {
	
	public static void main(String[] args) {
		
		
		
		TeaBag teaBag = new TeaBag(TeaBag.GREEN);
		
		Kettle kettle = new Kettle();
		
		Water water = kettle.getWater();
		
	kettle.boil();
	
		Cup cup = new Cup();
		
		water.isHot();
		
		cup.makeTea(teaBag, water);
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
