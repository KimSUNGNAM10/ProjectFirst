package com.yedam.classes.inherit;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		
		vehicle.run();
		
		vehicle = new Bus(); //부모클래스 변수타입에 자식 클래스 인스턴스 할당 가능 , 자동형변환
		vehicle.run();
		
		vehicle = new Taxi();
		vehicle.run();
		
		Taxi taxi = (Taxi) vehicle; //부모클래스는 자식클래스로 자동으로 안됨, 직접 형변환해야됨
		taxi.run();
		
	}
}
