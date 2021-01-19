package blankfinalVariable;

/*
 *  
 * A final variable that is not initialized at the time of 
 * declaration is known as blank final variable.
 * We must initialize the blank final variable in 
 * constructor of the class otherwise it will throw a 
 * compilation error  
 *
 */

public class Mobile {
	
	final int num;
	
	Mobile(){
		System.out.println("Constructor");
		num = 9171;
	}
	
	public void phoneNumber() {
		final String name;
		System.out.println(name);
	}

}
