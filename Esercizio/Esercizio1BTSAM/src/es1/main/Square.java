package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Square extends Shape{
	public double area(){
		double s = this.getSide();
		return s * s;
	}
	public double perimeter(){
		double s = this.getSide();
		return s * 4;
	}
}
