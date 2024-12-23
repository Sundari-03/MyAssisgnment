package Week.Assignment;

public class facebook extends TestData {
	public void enterUserName()
	{
		System.out.println("enterUserName");
	}
	public void enterPassword() 
	{
		System.out.println("enterPassword");
	}
	

	public static void main(String[] args) {
		facebook fb=new facebook();
		fb.enterUserName();
		fb.enterUserName();
		fb.enterCredentials();
		fb.navigateToHomePage();

	}

}
