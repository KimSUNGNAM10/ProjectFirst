package com.yedam.classes.statics;

public class Car {
	private int speed;
	private boolean stop;

//	Car(int speed) {
//		this.speed = speed;
//	}
	void setSpeed(int speed) {
		if (speed < 0)
			this.speed = 0;
		else
			this.speed = speed;
	}
	
	int getSpeed() {
		return this.speed;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
}
