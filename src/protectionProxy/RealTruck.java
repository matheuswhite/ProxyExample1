package protectionProxy;

public class RealTruck implements Car{
private Driver driver;
	
	public RealTruck(Driver driver) {
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
