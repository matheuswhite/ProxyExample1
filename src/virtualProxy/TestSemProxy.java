package virtualProxy;

public class TestSemProxy {

	public static void main(String[] args) {
		Image image1 = new RealImage("Foto1_1GB.jpg");
		Image image2 = new RealImage("Foto2_900MB.jpg");
		
		image1.show();
		image1.show();
		image2.show();
		image2.show();
		image2.show();
		image1.show();
	}

}
