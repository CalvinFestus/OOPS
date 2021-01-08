package package1;

import package2.AndroidMobile;

public class AparnaMobile2 {
	
	public static void main(String[] args) {
		
		AndroidMobile am = new AndroidMobile();
		
		//All Public Methods will be accessed - calling, camera and os
		am.calling();
		am.camera();
		am.operatingSystem();
		
		//Protected Methods inside package alone will be available by extending class
		am.mailBox();
		am.simCard();
		
		
		//No Default - as AndroidMobile is in other package

		//No Private - as Private Methods cannot be accessed outside class
		
		
	}

}
