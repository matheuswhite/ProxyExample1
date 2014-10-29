package virtualProxy.smell;

public class RealImage {
	private String nameFile;
	
	public RealImage(String nameFile) {
		this.nameFile = nameFile;
		this.loadFile();
	}
	
	public void show() {
		System.out.println("Mostando o arquivo: " + this.nameFile);
	}

	public void loadFile() {
		System.out.println("Carregando o arquivo: " + this.nameFile);
	}
}
