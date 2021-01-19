package package2;

//Multiple Inheritance

public class Phone implements PhoneRules,IndianGovtRules {
	
	public void calling() {
		System.out.println("This Method is for Calling");
	}

	@Override
	public void imeiNumber() {
		System.out.println("This Method is for IMEI Number");
	}
	
}
