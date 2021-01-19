package package1;

//Interface can Implemented in a class after extending another class

public class SmartPhone extends Phone implements IndianGovtRules{
	
	public void camera() {
		System.out.println("This Method is for Camera");
	}

	@Override
	public void aadharCard() {
		System.out.println("This Method is for Aadhar Card");
	}
	
}
