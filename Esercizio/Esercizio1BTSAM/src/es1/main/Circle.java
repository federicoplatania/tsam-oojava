package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Circle extends Shape {
	public double area(){
		double a = this.getRadius();
		return (a*a)* Math.PI;
	}
	public double perimeter(){
		double per = this.getRadius(); ;
		return (per * 2 * Math.PI);
	}
	
}
