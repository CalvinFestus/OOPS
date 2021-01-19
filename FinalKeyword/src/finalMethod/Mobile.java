package finalMethod;

/* 
 * final methods cannot be overridden 
 */

public class Mobile {
	
	final int num;
	
	Mobile(){
		num = 9171;
	}
	//Super Class/ Parent
	public void phoneNumber() {
		System.out.println("Phone Number");
	}

}
