package package2;

import package1.SmartPhone;

public class AndroidMobile extends SmartPhone {
	
	public void operatingSystem() {
		System.out.println("This Method is for Operating System");
	}
	
	private void fingerPrint() {
		System.out.println("This Method is for Finger Print");
	}
	
	protected void docScanner() {
		System.out.println("This Method is for Scanner");
	}
	
	void movementSensor() {
		mailBox();
		System.out.println("This Method is for Sensors");
	}

}
