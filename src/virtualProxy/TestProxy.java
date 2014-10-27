package virtualProxy;

public class TestProxy {

	public static void main(String[] args) {
		Image image1 = new ImageProxy("Foto1_100MB.jpg");
		Image image2 = new ImageProxy("Foto2_90MB.jpg");
		
		image1.show();
		image1.show();
		image2.show();
		image2.show();
		image2.show();
		image1.show();
	}

}
