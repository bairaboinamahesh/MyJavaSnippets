import java.util.Scanner;
class sara
{ 
	public int length(int num)
	{ 
		int count = 0;
		while(num>0)
		{  
			num = num / 10;
			count++;
		}
		//System.out.println(count);
		return count;	

	}

	public int power(int c, int len)
	{
		int tmp = c;
           
		for(int i=1; i < len; i++)
		{
			tmp = tmp * c;
		}
		//System.out.println(c);
		return tmp;

	}

	public void arm(int num)
	{  
  		/*if(num == 0)
		{
			System.out.println( "0 is not armstrong number");
		}*/
		//else
		//{
		int dup=0, c=0, onum=num;
		int len = length(num);
            
            for(int i=1; i<=num; i++)
            { 
            
		while(i>0)
		{

			c =i % 10;
			dup = dup + power(c, len);
			i = i/10;

		}
		if(dup==onum)
		{
			System.out.println(onum);
		}
		/*else
		{
			System.out.println(onum + "is not a armstrong number");
		}*/

		}



	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int range= sc.nextInt();
            
           sara as= new sara();
		
	        as.arm(num);

	}

}













