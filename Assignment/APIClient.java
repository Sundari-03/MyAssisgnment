package week4.Assignment;

public class APIClient {
	
	public void sendRequest(String endpoint) 
	{
		System.out.println("The sendRequest is " + endpoint );	
	}

	public void sendRequest(String endpoint,String requestBody,Boolean requestStatus)
	{
		System.out.println("endpoint =" + endpoint + " requestBody =" + requestBody + " requestStatus =" + requestStatus);
		if(requestStatus) 
		{
			System.out.println("The request send Sucessfully");
		}
		else
		{
			System.out.println("The request  send failed");

		}
		
	}
	public static void main(String[] args) {
		
		APIClient apclient=new APIClient();
		apclient.sendRequest("www.gamil.com");
		apclient.sendRequest("www.testleaf.com","print",true);
		System.out.println("----------------------------");
		apclient.sendRequest("finished", "completed", false);
	
	}
}
