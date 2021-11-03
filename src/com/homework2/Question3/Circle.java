package com.homework2.Question3;

public class Circle implements Shape {
	private double radius;
	public Circle(double r) {
		this.radius =r;
	}
	@Override
	public void display() {
		System.out.println("Drawing a Circle");
	}
	@Override
	public double calculateArea() {
		double area=3.14*this.radius*this.radius;
		return area;
	}
	public double getRadius() {
		 return this.radius;
	 }

}
