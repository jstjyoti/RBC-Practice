package MultiThreading;

public class DemoThread extends Thread {

	
	public void run() 
	{
		
		for(int i = 0;i<50;i++)
			
		{
			if(i%2==0)
			{
				System.out.println("even no is "+i);
				try
				{
					
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		
		
for(int i = 0;i<50;i++)
			
		{
			if(i%2!=0)
			{
				System.out.println("odd no is "+i);
				try
				{
					
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		
	}

}

class Test
{
	public static void  main(String...args)
	{
		DemoThread t=new DemoThread();
		t.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Table 2 * "+i+" ="+(2*i));
		}
	}
}
