package MultiThreading;

public class ArraywithoutMT {
	
	private int [][] arr;
	private int product=1;
	private int sum=0;
	 static double startTime=System.currentTimeMillis();
	public int[][] getArr() {
		return arr;
	}
	public void setArr(int[][] arr) {
		this.arr = arr;
	}
	public int getProduct() {
		return product;
	}
	public void setProduct(int product) {
		this.product = product;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public ArraywithoutMT(int[][] arr) {
		
		this.arr = arr;
		//this.setSum(sum);
		//this.setProduct(product);
	}
	
	public void arrayOperation()
	{
		for(int s=0;s<arr.length;s++)
		{
			for(int t=0;t<arr[s].length;t++)
			{
			 product = product*arr[s][t];
			// System.out.println("product for row number "+s+" is "+ product);
			}
			
			System.out.println("product for row "+s+" is "+ product);
			sum=sum+product;
			
			product=1;
		}
		System.out.println("Sum of total rows without using Thread "+sum);
		double endTime = System.currentTimeMillis();
	    System.out.println("It took " + (endTime - startTime)/1000 + " seconds");
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		
		
	}

}
