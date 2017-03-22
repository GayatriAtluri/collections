package sample.com.java;

public class Car extends AutoMobile{
	
	private String mileage;
	private String speed;
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	public String move(){
		return "90 miles per hour";
	}

}
