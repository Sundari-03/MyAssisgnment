package Week.Assignment;

public class Chrome extends TestData{
	
	public void enterUsername()
	{
		System.out.println("enterUsername");
	}
    public void enterPassword()
    {
    	System.out.println("enterPassword");
    
    }
	public static void main(String[] args) {
		Chrome ch=new Chrome();
		ch.enterCredentials();
		ch.enterUsername();
		ch.enterPassword();
		ch.navigateToHomePage();
	}

}
