package project6;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
	private double radius;
	public CircleFromSimpleGeometricObject() {
	}
	public CircleFromSimpleGeometricObject(double r) {
		this.radius = r;
	}
	public CircleFromSimpleGeometricObject(
			double r,String c,boolean f) {
		this.radius = r;
		setColor(c);
		setFilled(f);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getDiameter() {
		return 2*radius;
	}
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	public void printCircle() {
		System.out.println("The circle is created "+getDateCreated()+" and the radius is "+radius);	
	}
}
