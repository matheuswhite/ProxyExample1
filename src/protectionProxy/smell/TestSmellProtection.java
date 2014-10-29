package protectionProxy.smell;

public class TestSmellProtection {

	public static void main(String[] args) {
		Driver driver1 = new Driver(19, "Matheus");
		Driver driver2 = new Driver(16, "Cesár");
		
		RealCar car = new RealCar(driver1);
		RealCar car2 = new RealCar(driver2);
		
		car.driveCar();
		car2.driveCar();

	}

}
