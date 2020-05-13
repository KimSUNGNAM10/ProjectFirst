package com.yedam.classes.inherit;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 0; i < 5; i++) {
			car.run();

			for (int i1 = 0; i1 < 5; i1++) {
				int problemLocation = car.run();

				switch (problemLocation) {
				case 1:
					System.out.println("앞왼쪽 HanKookTire 교체");
					car.frontLeftTire = new HanKookTire("앞왼쪽", 15);
					break;
				case 2:
					System.out.println("앞오른쪽 KumhoTire 교체");
					car.frontRightTire = new KumhoTire("앞오른쪽", 16);
					break;
				case 3:
					System.out.println("뒤왼쪽 HanKookTire 교체");
					car.backRightTire = new KumhoTire("앞오른쪽", 17);
					break;
				case 4:
					System.out.println("뒤오른쪽 KumhoTire 교체");
					car.backRightTire = new KumhoTire("앞오른쪽", 18);
					break;

				}
				System.out.println("====================================");
			} 
		} 
	}
}