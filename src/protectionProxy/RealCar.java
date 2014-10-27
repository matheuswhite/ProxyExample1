package protectionProxy;

public class RealCar implements Car {
	private Driver driver;
	
	public RealCar(Driver driver) {
		this.driver = driver;
	}
	
	@Override
	public void driveCar() {
		System.out.println("Este carro está sendo dirigido por " + driver.getName() + " !");

	}
	
	public Driver getDriver() {
		return this.driver;
	}

}
