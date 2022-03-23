import java.util.Scanner;
class peterson
{
	public void peter(int num)
	{
		int c=0, onum=num, sum = 0;
		factorial f = new factorial();
		while(num>0)
		{
			c = num % 10;
			sum= sum + f.fact(c);
			num = num / 10;
		}
		if(sum == onum)
		{	System.out.println(onum +"is a peterson number" );
		}
		else
		{
			System.out.println(onum +" is not a peterson number" );
		}

	}


	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		peterson p = new peterson();	
		p.peter(num);
	}

}

class factorial
{
	public int fact(int c)
	{ 
		int num = 1;
		for(int i= 1;i<=c;i++)
		{
			num = num * i;

		}
		return num;

	}



}
