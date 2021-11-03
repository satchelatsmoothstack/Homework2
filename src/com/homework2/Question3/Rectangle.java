package com.homework2.Question3;

public class Rectangle implements Shape{
	private double base;
	private double height;
	public Rectangle(double h, double b) {
		this.base = b;
		this.height=h;
	}
	@Override
	public void display() {
		System.out.println("Drawing a Circle");
	}
	@Override
	public double calculateArea() {
		double area=3.14*this.base*this.height;
		return area;
	}

}
