package com.cg.oopsinjava.abstractprogram;

public abstract class Shape {
	String colour="red";
	boolean field=true;
	public abstract void getArea();
	public abstract void getPerimeter();
	
	public Shape() {
		
	}
    public Shape(String colour,boolean field) {
    	super();
    	this.colour=colour;
    	this.field=field;
    }
    public String getColour() {
    	System.out.println("Colour:"+colour);
    	return colour;
    }
    
    public String setColour(String colour) {
    	return this.colour=colour;
    }
    public boolean isField() {
    	return field;	
    }
    public void setField(boolean field) {
    	this.field=field;
    }
    public String toString() {
    	return" "+"colour:"+colour+" "+"field:"+field;
    }
}
