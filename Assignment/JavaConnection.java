package week4.Assignment;

public class JavaConnection implements DatabseConnection
{
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
	
    public void testRun()
    {
    	System.out.println("Run the program");
    }

    

    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
    		DatabseConnection db=new JavaConnection();
    		db.connect();
    		db.disconnect();
    		db.executeUpdate();

    	}
}
