package com.java.nagesh;

public class Animal {
	
	private String name;
	private int size;
	private int weight;
	private String color;
	public Animal(String name, int size, int weight, String color) {
		super();
		this.name = name;
		this.size = size;
		this.weight = weight;
		this.color = color;
	}
	
	public void eat() {
		System.out.println("animal.eat method is called");
	}
	
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	public int getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	}


}
