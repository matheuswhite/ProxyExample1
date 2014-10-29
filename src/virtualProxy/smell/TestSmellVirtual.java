package virtualProxy.smell;

public class TestSmellVirtual {

	public static void main(String[] args) {
		RealImage image1 = new RealImage("Foto1_1GB.jpg");
		RealImage image2 = new RealImage("Foto2_850MB.jpg");
		
		image1.show();
		image1.show();
		image2.show();
		image2.show();
		image2.show();
		image1.show();
	}

}
