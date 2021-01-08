package package2;

import package1.SmartPhone;

public class SreeMobile {

	public static void main(String[] args) {

		SmartPhone ph = new SmartPhone();

		//All Public Methods will be accessed - calling and camera
		ph.calling();
		ph.camera();
		
		//Protected, Default cannot be accessed outside package

	}

}
