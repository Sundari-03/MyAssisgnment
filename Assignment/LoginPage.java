package week4.Assignment;

public class LoginPage extends BasePage
{
	public void performCommonTasks()
	{
		System.out.println("Tasks are not performed");
	}
	
	public static void main(String[] args) 
	{
		LoginPage lPage=new LoginPage();
		lPage.findElement();
		lPage.clickElement();
		lPage.enterText();
		lPage.performCommonTasks();
			
	}
}
