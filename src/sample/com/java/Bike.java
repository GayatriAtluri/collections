package sample.com.java;

public class Bike extends AutoMobile {
	private String horsepower;
	private String style;
	private String fueltype;
	public String getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(String horsepower) {
		this.horsepower = horsepower;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	
	public String move(){
		System.out.println("Calling move method in Bike object");
		return "70 miles per hour";
	}
}
