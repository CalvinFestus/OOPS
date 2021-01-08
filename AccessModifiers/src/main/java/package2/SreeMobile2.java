package package2;

public class SreeMobile2 {
	
	public static void main(String[] args) {
		
		AndroidMobile am = new AndroidMobile();
		
		//All Public Methods will be accessed - calling, camera and os
		am.calling();
		am.camera();
		am.operatingSystem();
		
		//Protected Methods only in Android will be available - docScanner
		//Protected Methods from Other Package will be available only for
		//extending class i.e. mailBox and simCard will be only for Android Mobile
		am.docScanner();
		
		//default method inside package alone will accessibe
		am.movementSensor();
		
		
	}

}
