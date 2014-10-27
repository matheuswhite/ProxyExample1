package protectionProxy;

public class TestSemProtectionProxy {

	public static void main(String[] args) {
		Driver driver1 = new Driver(19, "Matheus Tenório");
		Driver driver2 = new Driver(16, "Cesár Augusto");
		
		Car car = new RealCar(driver1);
		Car car2 = new RealCar(driver2);
		
		car.driveCar();
		car2.driveCar();

	}

}
