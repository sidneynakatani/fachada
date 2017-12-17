package br.com.sidney.fachada;

import br.com.sidney.fachada.facade.ShapeFacade;

public class FacadeDemo {
	
	public static void main(String[] args){
		ShapeFacade shapeMaker = new ShapeFacade();
		
		shapeMaker.drawCircle();
		shapeMaker.drawSquare();
		shapeMaker.drawTriangle();
	}

}
