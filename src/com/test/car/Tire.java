package com.test.car;

public class Tire {

	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire lifespan: " + (maxRotation-accumulatedRotation) + " times left.");
			return true;
		} else {
			System.out.println("*** " + location + " tire blowout ***");
			return false;
		}
	}
}
