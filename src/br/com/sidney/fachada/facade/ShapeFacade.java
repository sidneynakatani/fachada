package br.com.sidney.fachada.facade;



import br.com.sidney.fachada.shapes.Shape;
import br.com.sidney.fachada.shapes.impl.Circle;
import br.com.sidney.fachada.shapes.impl.Square;
import br.com.sidney.fachada.shapes.impl.Triangle;

public class ShapeFacade {

	
	private Shape circle;
	private Shape square;
	private Shape triangle;
	
	
	public ShapeFacade(){
		this.circle = new Circle();
		this.square = new Square();
		this.triangle = new Triangle();
	}
	
	public void drawCircle(){
		this.circle.draw();
	}
	
	public void drawSquare(){
		this.square.draw();
	}
	
	public void drawTriangle(){
		this.triangle.draw();
	}
}
