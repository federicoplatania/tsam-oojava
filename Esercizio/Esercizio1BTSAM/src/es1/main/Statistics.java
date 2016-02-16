package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Statistics extends Shape {
	public Statistics(double perimeter, double area){
		this.setArea(area);
		this.setPerimeter(perimeter);
		
	}
	
	public void add(Statistics s) {
		
		area+= s.area;
		perimeter += s.perimeter;
		
		
		
	}
}
