package com.test.car;

public class KumhoTire extends Tire {
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " KumhoTire lifespan: "+(maxRotation-accumulatedRotation)+" times left.");
			return true;
		} else {
			System.out.println("*** "+location +" KumhoTire blowout. ***");
			return false;
		}
	}
}
