package protectionProxy.smell;

public class RealCar {
	private Driver driver;
	
	public RealCar(Driver driver) {
		this.driver = driver;
	}
	
	public void driveCar() {
		if(this.driver.getAge() >= 18) {
			System.out.println("Este carro está sendo dirigido por " + driver.getName() + " !");
		}
		else {
			System.out.println("Permissao negada!\nO motorista " + this.driver.getName() + " deve ser maior de idade");
		}
	}
	
	public Driver getDriver() {
		return this.driver;
	}

}
