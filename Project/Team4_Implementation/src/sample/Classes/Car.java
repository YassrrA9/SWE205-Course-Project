package sample;

import java.util.ArrayList;

public class Car {
	private String name;
	private String model;
	private String size;
	private String color;
	private String type;
	private ArrayList<String> car;
	public Car() {
		
	}
	
	public Car(String type, String name, String model, String size, String color) {
		this.type = type;
		this.name = name;
		this.size = size;		
		this.model = model;
		this.color = color;
		
	}
	
	public void deleteCar(Car obj) {
		
		obj=null;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
/*
	public Boolean check(String ) {
	
	}
	*/
	
	public String toString() {
		return "Type: "+getType()+", Name: "+getName()+", Model: "+getModel()+", Size: "+getSize()+", Color: "+getColor();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
