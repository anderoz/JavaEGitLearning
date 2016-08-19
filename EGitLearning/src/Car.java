
public class Car {

	// Class variables
	String carName;

	// Class constructors
	public Car() {
		carName = "unknown";
	}

	public Car(String carName) {
		this.carName = carName;
	}

	// Class methods
	public void accelerate() {
		System.out.println("Vroom!");
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + "]";
	}

	public static void main(String[] args) {

		Car car1 = new Car("winner");

		System.out.println(car1);

		car1.accelerate();
		
		System.out.println(PrimeSum.check(241,1));
		System.out.println(PrimeSum.check(245,6));
	}

}
