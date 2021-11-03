package com.homework2.Question3;

public class Triangle implements Shape {
	private double height;
	private double base;
	public Triangle(double h, double b) {
		this.height = h;
		this.base = b;
	}
	@Override
	public void display() {
		System.out.println("Drawing a Triangle");
	}
	@Override
	public double calculateArea() {
		double area=0.5*this.height*this.base;
		return area;
	}
	public double getHeight() {
		 return this.height;
	}

}
