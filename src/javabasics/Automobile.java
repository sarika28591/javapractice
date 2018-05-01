package javabasics;

public class Automobile {
	String model;
	String make;

	//constructor
	public Automobile(String model, String make) {
		this.model = model;
		this.make = make;
		}

	//get method
	public String getModel() {
	 return model;
	}

	public String getMake() {
		return make;
	}


	//instance method
	public void start() {
		System.out.println("It is started");
	}

	}

