package sample.com.java;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoMobile automobile = new AutoMobile();
		automobile.getColor();
		/*Car car = new Car();
		car.move();
		Bike bike = new Bike();
		bike.move();*/
		automobile = new Car();
		System.out.println("AutoMobile car " + automobile.move());
		automobile = new Bike();
		System.out.println("AutoMobile Bike " + automobile.move());
	}

}
