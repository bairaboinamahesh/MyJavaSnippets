import java.util.Scanner;
class palindrome
{
	public void palin(int num)	
	{
		int rev = num,sum=0,c=0;
		while(num>0)
		{
			c = num % 10 ;
			sum = (sum * 10) + c;
			num = num / 10 ;
		}
		if ( rev == sum)
		{
			System.out.println(rev + "is a palindrome number");
		}
		else
		{
		  System.out.println(rev + "is not a palindrome number");
		}

	}

	public static void main(String[] args)	
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		palindrome pn = new palindrome();
		pn.palin(num);
	}

}