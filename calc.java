import java.util.Scanner;
class calc
{
	public void add(int num1, int num2)
	{
		int y = num1 + num2;
		System.out.println("addition=" +y);
	}

	public void sub(int num1, int num2)
	{
		int y = num1 - num2;
		System.out.println("substraction=" +y);
	}

	public void div(int num1, int num2)
	{   
		if(num1 ==0 && num2 == 0)
		{
			System.out.println("not possible");
		}

		else
		{
			int y = num1 / num2;
			System.out.println("division=" +y);
		}
	}

	public void multi(int num1, int num2)
	{
		int y = (num1 * num2);
		System.out.println("multiplication=" +y);
	}

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in); 
            System.out.println("enter any two numbers ");
            System.out.println("enter your 1st number ");
		int num1=sc.nextInt();
            System.out.println("enter your 2nd number ");
		int num2=sc.nextInt();
            System.out.println("enter which operation you want add = 1 substract = 2 division = 3 multiplication = 4 ");

		int opr=sc.nextInt();
		calc c= new calc();
            {
            if(opr==1)
		{

			c.add(num1,num2);
		}
		else if(opr==2)
		{
			c.sub(num1,num2);
		}
		else if(opr==3)
		{
			c.div(num1,num2);
		}
		else if(opr==4)
		{
			c.multi(num1,num2);
		}
		else
		{
			System.out.println("enter numbers from 1 to 4");
		}

          }
	}

}
