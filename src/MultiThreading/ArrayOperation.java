package MultiThreading;

import java.util.Scanner;

 class ArrayOperation {
	 static double startTime=System.currentTimeMillis();
	
	public static void main(String...args)
	{
		
		Scanner sc=new Scanner(System.in);
		int product=1;
		int sum=0;

	int row=sc.nextInt();
	int column=sc.nextInt();
	
	int [][] arr=new int [row][column];
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			 arr[i][j] = (int)((Math.random()*10)+1);
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
	
	
	for(int s=0;s<arr.length;s++)
	{
		for(int t=0;t<arr[s].length;t++)
		{
		 product = product*arr[s][t];
		 //System.out.println("product for row number "+s+" is "+ product);
		}
		
		System.out.println("product for row "+s+" is "+ product);
		sum=sum+product;
		
		product=1;
	}
	System.out.println("Sum of total rows "+sum);
	double endTime = System.currentTimeMillis();
    System.out.println("It took " + (endTime - startTime)/1000 + " seconds");
	

}
	
	
}
	
	
	
	


