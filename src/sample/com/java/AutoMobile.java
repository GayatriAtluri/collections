package sample.com.java;

public class AutoMobile {
	private String engine;
	private String color;
	private int wheels;
	
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getColor() {
		System.out.println("Color of my car is Orange");
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public String move(){
		System.out.println("Move method in AutoMobile object");
		return "100 miles per hour";
	}
	
	public void noise(){
		
	}
}
