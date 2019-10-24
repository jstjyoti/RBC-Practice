package MultiThreading;

class SynchroExample2 {
	
	
	 
 synchronized void tablePrint(int a)
	 {
		 try
		 {
			 for(int i=1;i<=10;i++)
			 {
				 System.out.println(a+" * " +i+" = "+a*i);
				 Thread.sleep(1000);
				 
			 }
			 
			 sum(10,25);
		 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
	 }
	
 synchronized void sum(int a,int b)
	 
	 {
		 
		 int sum=0;
		 try
		 {
			 for(int i=a;i<=b;i++)
			 {
				 sum=sum+i;
				 System.out.println("sum now is "+sum);
				 Thread.sleep(1000);
				 
				 
			 }
			 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	
	
 }
}
 class MThread2 implements Runnable
 {
	 
	 SynchroExample2 se;
	 
	 MThread2( SynchroExample2 se)
	 {
		 this.se=se;
	 }
	 

	@Override
	public void run() 
	{
		se.tablePrint(15);
		//se.sum(10, 25);
	
		
	}
	 
 }
 
 
 class Cfg2
 {
	 public static void main(String...args)
	 
	 {
		 SynchroExample2 se=new SynchroExample2();
		// MThread2 me=new MThread2(se);
		// MThread2 me1=new MThread2(se);
		 
		 Thread t1=new Thread(new MThread2(se));
		 Thread t2=new Thread(new MThread2(se));
		 
		 t1.start();
		 t2.start();
	 }
	 
 }
 
	
 
	


