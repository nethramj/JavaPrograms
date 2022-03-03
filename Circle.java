package com.cg.oopsinjava.abstractprogram;

public class Circle extends Shape{
	
	double radius=4.0;
	public Circle() {
		
	}
	public Circle(String colour,boolean field,double radius) {
    	super();
    	this.radius=radius;
    	this.colour=colour;
    	this.field=field;
    }
    public void getArea() {
    	System.out.println("Area:"+(Math.PI*radius*radius));
 
    }
    
    public void getPerimeter(){
    	System.out.println("Perimeter:"+(2*Math.PI*radius));
    	
    }

}
