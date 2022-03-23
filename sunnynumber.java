import java.util.Scanner;
class sunnynumber
{
	public int square(int sum)
	{
		for(int i=1;i<100;i++)
		{
			if(sum == (i * i))
			{
		
				return 0;
			}
		}
		return -1;
	} 		
	public void sunny(int num)
	{

		if( square(num+1) == 0 )
		{   
			System.out.println(num +" is a sunny number" );
		}		
		else
		{
			System.out.println(num +"is not a sunny number");
		}
   		
   
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sunnynumber sn= new sunnynumber();
		sn.sunny(num);		


	}
}
