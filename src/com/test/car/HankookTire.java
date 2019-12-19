package com.test.car;

public class HankookTire extends Tire {
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " HankookTire lifespan: "+(maxRotation-accumulatedRotation)+" times left.");
			return true;
		} else {
			System.out.println("*** "+location +" HankookTire blowout. ***");
			return false;
		}
	}
}
