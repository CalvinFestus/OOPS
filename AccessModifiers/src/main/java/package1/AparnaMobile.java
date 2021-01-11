package package1;

/*
 * Access Modifiers
 */

public class AparnaMobile {
	
	public static void main(String[] args) {
		
		SmartPhone j7 = new SmartPhone();
		
		//All  Public  Methods will be accessed - calling and camera
		j7.calling();
		j7.camera();
		
		//All default methods will be accessed - bluetooth and document reader
		j7.blueTooth();
		j7.documentReader();
		
		//All Protected Methods will be accessed - mailBox and Simcard
		j7.mailBox();
		j7.simCard();
		
		//Private Methods cannot be accessed outside the class
		
		
	}

}
