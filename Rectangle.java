package com.cg.oopsinjava.abstractprogram;

public class Rectangle extends Shape {
	double Width=3.0;
	double length=5.0;
	Rectangle(){}
	public Rectangle(double Width,double length){
    	super();
    	this.Width = Width;
    	this.length=length;
    }
    public void getArea() {
    	System.out.println("AreaOf Rectangle"+(length*Width));
 
    }
    
    public void getPerimeter(){
    	System.out.println("Perimeter of Rectangle:"+2*(length+Width));
    	
    }

}


