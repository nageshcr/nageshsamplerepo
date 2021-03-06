package com.factory.design;

public class FactoryPatternDemo {

	public static void main(String[] args) {
      
		Shape circle = ShapeFactory.getShape("CIRCLE");
		circle.draw();
		Shape rectangle = ShapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		Shape square = ShapeFactory.getShape("SQUARE");
		square.draw();
		Shape trianlge = ShapeFactory.getShape("TRIANGLE");
		trianlge.draw();
		
	}

}
