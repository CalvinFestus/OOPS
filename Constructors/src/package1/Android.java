package package1;

public class Android extends Mobile{
	
	String name;
	String phoneModel;
	
	public Android(){
		this("Anupama","OnePlus");
		System.out.println("Android Constructor");
	}
	
	public Android(Mobile mob) {
		System.out.println("Android Constructor with Mobile Parameter");
	}
	
	public Android(String name, String phoneModel){
		this.name = name;
		this.phoneModel = phoneModel;
		System.out.println("Android Constructor");
	}
	
	public void Camera() {
		System.out.println("Cam");
	}
	
	public void calling() {
		System.out.println("Calling in Android");
	}
	
	public void chooseCalling() {
		this.calling();
		//super.calling();
	}

	/* 
	// No Arg Constructor
	Android(){
		super();
	}
	*/

	/* 
	// No Arg Constructor
	Android(){
		name = "EmojiGirl";
		phoneModel = "Samsung";
	}
	 */
	
	/*
	// Parameterized Constructor
	Android(String personName, String mobName){
		this.name = personName;
		this.phoneModel = mobName;
	}
	*/

}
