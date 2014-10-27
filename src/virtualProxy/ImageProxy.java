package virtualProxy;

public class ImageProxy implements Image {
	private String nameFile;
	private Image image;
	
	public ImageProxy(String nameFile) {
		this.nameFile = nameFile;
	}
	
	@Override
	public void show() {
		if(image == null) {
			image = new RealImage(this.nameFile);
		}
		image.show();
	}
}
