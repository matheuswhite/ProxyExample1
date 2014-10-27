package protectionProxy;

public class TestProtectionProxy {
	
	public static void main(String[] args) {
		Driver driver1 = new Driver(19, "Matheus");
		Driver driver2 = new Driver(16, "Cesár");
		
		Car car = new ProxyCar(driver1);
		Car car2 = new ProxyCar(driver2);
		
		car.driveCar();
		car2.driveCar();
	}
}
