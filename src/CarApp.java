
public class CarApp {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("Volvo", "v40", 25, false);
		
		System.out.println("\n** Car 1 **");
		car1.printData();
		car1.accelerate();
		car1.brake();
		car1.printData();
		car1.refuel(0);
		
		System.out.println("\n** Car 2 **");
		car2.printData();
		car2.accelerate();
		car2.brake();
		car2.printData();
		car2.refuel(40);
	}

}

// End of CarApp

class Car {
	public String brand;
	public String model;
	public int amountOfFuel;
	public boolean accelerateStatus;
	
	public Car() {
		brand = "Fiat";
		model = "500";
		amountOfFuel = 50;
		accelerateStatus = true;
	}
	
	public Car(String brand, String model, int amountOfFuel, boolean accelerateStatus) {
		this.brand = brand;
		this.model = model;
		this.amountOfFuel =  amountOfFuel;
	}
	
	public void brake() {
		System.out.println("Car is breaking");
	}
	
	public void accelerate() {
		if (accelerateStatus) {
			System.out.println("Car is accelerating");
			amountOfFuel--;
		}
	}
	
	public void printData() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Amount of Fuel: " + amountOfFuel);
	}
	
	public void refuel(int amount) {
		System.out.println("Fuel on the tank: " + amountOfFuel);
		System.out.println("Refuel: " + amount);
		System.out.println("Fuel on the tank after the refuel: " + (amountOfFuel + amount));
	}
}
