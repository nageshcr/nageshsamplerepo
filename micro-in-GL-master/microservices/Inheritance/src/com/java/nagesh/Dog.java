package com.java.nagesh;

public class Dog extends Animal {

	private int legs;
	private int eyes;

	public Dog(String color, int legs, int eyes) {
		super("animal", 1, 20, color);
		this.legs = legs;
		this.eyes = eyes;

	}

	public int getLegs() {
		return legs;
	}

	public int getEyes() {
		return eyes;
	}

	@Override
	public void eat() {
		System.out.println("eat method of animal class is over written");
	}

	public void bark() {
		System.out.println("dog is barking");

	}

}
