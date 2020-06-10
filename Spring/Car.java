package com.dependency;

public class Car implements Vehicle{
	private int maxSpeed;

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void move() {
		System.out.println("Car max speed is " +maxSpeed);

}
}