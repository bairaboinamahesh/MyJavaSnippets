import java.util.Scanner;
class technumber
{
	public  void tech(int num)
	{

		 int c=0, d=0,sum=0;
		c = num % 100;
		d = num / 100;
		sum = c+d;
		int sq= sum * sum;
		if(sq == num )
		{
			System.out.print(num + "is a tech number");
		}
		else
		{
			System.out.print(num + "is not a tech number");
		}
	}

	public static void main(String[] args)
	{
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int suum = sc.nextInt();
		technumber tn= new technumber();
		tn.tech(suum);
	}

}











