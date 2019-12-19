package com.test.car;

public class Car {
	Tire frontLeftTire = new Tire("Front-left", 6);
	Tire frontRightTire = new Tire("Front-right", 2);
	Tire backLeftTire = new Tire("Back-left", 3);
	Tire backRightTire = new Tire("Back-right", 4);
	
	int run() {
		System.out.println("Car is running.");
		if(!frontLeftTire.roll()) {stop(); return 1;}
		if(!frontRightTire.roll()) {stop(); return 2;}
		if(!backLeftTire.roll()) {stop(); return 3;}
		if(!backRightTire.roll()) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("Car has stopped.");
	}

}
