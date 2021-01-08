package package1;

public class SmartPhone extends Phone{
	
	public void camera() {
		gpsLocation();
		System.out.println("This Method is for Camera");
	}
	
	private void gpsLocation() {
		System.out.println("This Method is for GPS Loction");
	}
	
	protected void mailBox() {
		System.out.println("This Method is for checking Email");
	}
	
	void documentReader() {
		System.out.println("This Method is for reading documents");
	}
	
}
