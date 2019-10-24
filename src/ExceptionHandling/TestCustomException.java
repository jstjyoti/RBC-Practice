package ExceptionHandling;

public class TestCustomException
{

	static void validate(int age)throws CustomException
	{
		if(age<18)throw new CustomException("invalid age to cast vote");
		else
			System.out.print("Ready to vote");
	}
	
	public static void main(String...args)
	{
		try
		{
			validate(13);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
