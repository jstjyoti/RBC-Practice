package MultiThreading;

public class MultipleThread implements Runnable {
	
	
	String name;
	Thread t;
	public MultipleThread(String name)
	{
		this.name=name;
		 t=new Thread(this,name);
		 t.start();
	}
	
	
	public void print1()
	{
		
		
		if(t.getName().equals("one"))
		{
			for(int i=1;i<=5;i++)
				{
					System.out.println("name is "+name + " "+ i);
						

				}
		}
		
	}
	public void print2()
	{
		
		
		if(t.getName().equals("two"))
		{
			for(int i=1;i<=5;i++)
				{
					System.out.println("name is "+name + " "+ i*2);
						

				}
		}
		
	}
	@Override
	public void run() {
		
	
		
		try
		{
				print1();
				Thread.sleep(1000);
				print2();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
}
class Test5
{
	public static void main(String...args)
	{
		new MultipleThread("one");
		new MultipleThread("two");
		
	}
}