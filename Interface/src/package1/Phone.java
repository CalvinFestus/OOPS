package package1;

//Interface has to be Implemented in a class 

public class Phone implements PhoneRules {
	
	public void calling() {
		System.out.println("This Method is for Calling");
	}

	@Override
	public void imeiNumber() {
		System.out.println("This Method is for IMEI Number");
	}
	
}
