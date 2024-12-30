package week4.Assignment;

public class JavaConnection1 extends MySqlConnection{
	
	public void connect() 
	{
		System.out.println("Java connected to Database");
	}
	public void disconnect()
	
		{
		System.out.println("Java disconnected with Database");
	}
	
    public void executeUpdate() 
    {
    	System.out.println("Excute the update code");
    }
	
    public void executeQuery()
    {
    	System.out.println("Execute the test query");
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection1 jConnection=new JavaConnection1();
		jConnection.connect();
		jConnection.disconnect();
		jConnection.executeUpdate();
		jConnection.executeQuery();
		
		
		

	}

}
