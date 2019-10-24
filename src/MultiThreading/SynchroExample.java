package MultiThreading;

 class MThread1 {
	
	synchronized public void tablePrint(int a)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+" *" +i+" = "+a*i);
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
 class SynchroExample extends Thread
{ 
	MThread1 s;
	SynchroExample(MThread1 s)
	{
		this.s=s;
	}
	
	
	
	public void run() {
		s.tablePrint(5);
		
		
	}
	
}
class Gfg
{
	public static void main(String...args)
	{
		MThread1 s=new MThread1();
		SynchroExample se=new SynchroExample(s);
		SynchroExample se1=new SynchroExample(s);
		se.start();
		se1.start();
		
	}
}
