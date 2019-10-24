package MultiThreading;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

public class MainArray {
	
	
	static Scanner sc=new Scanner(System.in);
	static Date date=new Date();
	static long time=date.getTime();
	static Timestamp ts=new Timestamp(time);
	
	
	private static int row=sc.nextInt();
	private static int column=sc.nextInt();
	private static int [][] arr=new int [row][column];
	private static ArraywithMT a0,a1,a2,a3,a4;
	
	
	
	public static void main(String...args)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				 arr[i][j] = (int)((Math.random()*10))+1;
			}
		}
		
		
		for(int k=0;k<arr.length;k++)
		{
			for(int l=0;l<arr[k].length;l++)
			{
				 System.out.print(arr[k][l]+" ");	

				 
					
		
			}
			System.out.println(" ");
			
		}
		
		
		System.out.println(ts);
		
		ArraywithoutMT m=new ArraywithoutMT(arr);
		m.arrayOperation();
		
		 a0=new ArraywithMT(arr,0);
		 a1=new ArraywithMT(arr,1);
		 a2=new ArraywithMT(arr,2);
		 a3=new ArraywithMT(arr,3);
		 //a4=new ArraywithMT(arr,4);
		
		
		Thread t1=new Thread(a0);
		Thread t2=new Thread(a1);
		Thread t3=new Thread(a2);
		Thread t4=new Thread(a3);
		//Thread t5=new Thread(a4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		//t5.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			//t5.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("by the use of thread1 product is "+a0.getProduct());
		System.out.println("by the use of thread2 product is "+a1.getProduct());
		
		System.out.println("by the use of thread3 product is "+a2.getProduct());
		
		System.out.println("by the use of thread4 product is "+a3.getProduct());
		//System.out.println("by the use of thread5 product is "+a4.getProduct());
		
		
		
		
		//System.out.print("Sum of all product of rows "+a0.getProduct()+a1.getProduct()+a2.getProduct()+a3.getProduct());
		
		int sum=sum();
		System.out.print("Sum is "+sum);
		
	}

	private  static int sum()
	{
		return a0.getProduct()+a1.getProduct()+a2.getProduct()+a3.getProduct();
	}
	
	
	

}
