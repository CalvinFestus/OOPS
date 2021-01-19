package package1;

//Multiple Interfaces can be implemented 
//Multple Inheritance

public class AndroidMobile implements PhoneRules,IndianGovtRules {
	
	public void operatingSystem() {
		System.out.println("This Method is for Operating System");
	}

	@Override
	public void aadharCard() {
		System.out.println("This Method is for Aadhar Card");
	}

	@Override
	public void imeiNumber() {
		System.out.println("This Method is for IMEI Number");
	}

}
