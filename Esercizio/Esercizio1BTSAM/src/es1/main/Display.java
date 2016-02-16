package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Display extends Shape {
	private Shape[] shapes;

	public Shape[] getShapes() {
		return shapes;
	}

	public void setShapes(Shape[] shapes) {
		this.shapes = shapes;
	}
	public double totalPerimeter(){
		double sum = 0;
		for (Shape s: shapes){
			sum += s.perimeter();	
		}
		return sum;
	}
	public double totalArea(){
		double sum = 0;
		for (Shape s: shapes){
			sum += s.area();	
		}
		return sum;
	}
	
	
}
