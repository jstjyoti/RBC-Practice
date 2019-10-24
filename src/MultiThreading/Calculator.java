package MultiThreading;
import java.util.*;

public class Calculator implements Runnable {
	long a,b;
	public Calculator(int a,int b)
	{
		this.a=a;
		this.b=b;
	}

	@Override
	public void run() {
		add(a,b);
		mul(a,b);
		print(a);
	}

public  void print(long a) {
		for(int i=0;i<=a;i++)
		{
			System.out.println("printing "+i);
		}
		
	}

	synchronized public void add(long a,long b)
	{
		long sum=0;
	 for(long i=a;i<=b;i++)
	 {
		 sum=sum+i;
	 }
	 System.out.println("The sum from "+a+" to "+b+" is "+sum);
		
	}
	
	
	synchronized  public void mul(long a,long b)
	{
		
	 
	 System.out.println("The multiply result of  "+a+" and "+b+" is "+(a*b));
		
	}
	
	
	

}
class Test4
{
	public static void main(String...args)
	{
		Thread t1=new Thread(new Calculator(1,1000000));
		Thread t2=new Thread(new Calculator(1000000,2000000));
		Thread t3=new Thread(new Calculator(21000000,30000000));
		t1.start();
		t2.start();
		t3.start();
	}
}
