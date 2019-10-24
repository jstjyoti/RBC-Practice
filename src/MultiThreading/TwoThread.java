package MultiThreading;
import java.util.*;

public class TwoThread implements Runnable{
	
	Thread t;
	Scanner sc=new Scanner(System.in);

	int a=sc.nextInt();

	int b=sc.nextInt();
	int c;
	
	
	TwoThread(String name)
	{
		 t=new Thread(this,name);
		 t.start();
	
	}

	
	public void run() {
		
		try
		{
			for(int i=0;i<20;i++)
			{
			if(t.getName().equals("First Thread"))
				{
					Thread.sleep(1000);
					c=a+b;
					System.out.println("the sum is"+ c);
				}
			else if(t.getName().equals("Second Thread"))
			{
				Thread.sleep(1000);
				c=a-b;
				System.out.println("the diff is"+ c);
			}
			else if(t.getName().equals("Third Thread"))
			{
				Thread.sleep(1000);
				c=a*b;
				System.out.println("the product is"+ c);
			}
		}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
}


class Test3
{
	public static void main(String...args)
	{
		 TwoThread r=new TwoThread("First Thread");
		 TwoThread r1=new TwoThread("Second Thread");
		 TwoThread r2=new TwoThread("Third Thread");
		 
	}
}



