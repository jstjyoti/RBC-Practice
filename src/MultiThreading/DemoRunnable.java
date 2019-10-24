package MultiThreading;

public class DemoRunnable implements Runnable {

	@Override
	public void run() {
	
		for(int i=0;i<15;i++)
		{
			System.out.println("Child Thread is executing");
		}
		for(int i=0;i<15;i++)
		{
			System.out.println("Child1 Thread is executing");
		}
	}

}
class Test2
{
	public static void main(String...args)
	{
		
		DemoRunnable r=new DemoRunnable();
	
		Thread t=new Thread(r);
	
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread executing");
		}
	}
}
