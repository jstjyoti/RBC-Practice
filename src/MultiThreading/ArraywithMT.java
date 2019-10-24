package MultiThreading;

public class ArraywithMT implements Runnable
{
	
	private int [][] arr;
	private int product=1;
	private int sum;
	private int threadID;
	
	static double startTime=System.currentTimeMillis();
	public int[][] getArr() {
		return arr;
	}
	public void setArr(int[][] arr) {
		this.arr = arr;
		
		
	}
	public int getProduct() {
		return this.product;
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
	
	ArraywithMT (int [][] arr,int threadID)
	 {
		 this.arr=arr;
		 this.threadID=threadID;
		
	 }
	@Override
	public void run() 
	{
		arrayOperation1();	
	}
	synchronized  public void arrayOperation1()
	{
	   
	    this.product=1;
	    int arrayRow = arr.length;
	    int rowStart = (int)((int)(threadID/2) * (arrayRow/2));
	    int i = rowStart;
	    for(int j = 0;j < arr[i].length ; j++)
	    {
	    	setProduct(getProduct()*arr[i][j]);
	    }
	    System.out.println("Product of row" +rowStart+"is :"+this.getProduct());
	    
	}
}

	
		/*for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				product=product*arr[i][j];
			}
			System.out.println("product for row "+i+" is "+ product);
			sum=sum+product;
			
			product=1;
		}
		System.out.println("Sum of total rows "+sum);
		
		double endTime = System.currentTimeMillis();*/
	
	
	
   // System.out.println("It took " + (endTime - startTime)/1000 + " seconds");
	
	


