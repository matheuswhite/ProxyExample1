package protectionProxy;

public class ProxyCar implements Car {
	private Driver driver;
	private Car realcar;
	
	public ProxyCar(Driver driver) {
		this.driver = driver;
		realcar = new RealCar(driver);
	}
	
	@Override
	public void driveCar() {
		if(driver.getAge() >= 18) {
			realcar.driveCar();
		}
		else {
			System.out.println("Permissao negada!\nO motorista " + driver.getName() + " deve ser maior de idade");
		}
	}

}
