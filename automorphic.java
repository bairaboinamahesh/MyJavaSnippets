import java.util.Scanner;

class automorphic
{
   public int length(int num)
	{
	 	int count=0;
		while(num>0)
		{
			num = num/10;
 			count++;
		}
			return count;

	}

    public void auto(int num)
	{
		int y= 0, c=0,sum=0,rev=0,sq= num * num;
		int len = length(num);
		for(int i = 1;i<=len;i++)
		{
			c = sq % 10;
			rev = (rev * 10) + c;
			sq = sq / 10;
		}
		for(int i = 1;i<=len;i++)
		{
			y = rev % 10;
			sum = (sum * 10) + y;
			rev = rev / 10;
		}
		if(sum == num)
		{
			System.out.println( num + "automorphic number");
		}
		else
		{
			System.out.println( num + " not automorphic number");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		automorphic at = new automorphic();
		at.auto(num);
	}



}