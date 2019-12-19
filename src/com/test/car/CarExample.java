package com.test.car;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				car.frontLeftTire = new HankookTire("Front-left", 15);
				System.out.println("Front-left tire replaced with Hankook Tire.");
				break;

			case 2:
				car.frontRightTire = new KumhoTire("Front-right", 13);
				System.out.println("Front-left tire replaced with Kumho Tire.");
				break;

			case 3:
				car.backLeftTire = new HankookTire("Back-left", 14);
				System.out.println("Front-left tire replaced with Hankook Tire.");
				break;

			case 4:
				car.backRightTire = new KumhoTire("Back-right", 17);
				System.out.println("Front-left tire replaced with Kumho Tire.");
				break;
			}
			System.out.println("----------------------------");
		}
	}
}
