import java.util.Scanner;
class reverse
{
    public void rev(int num)
    {	
	int sum = 0,c;
	while(num>0)
	{ 
		c = num % 10;
		sum = (sum * 10 ) + c;
		num= num / 10 ;
	}
	System.out.print(sum);
    }

									


  

public static void main(String [] args)
  {
      Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	reverse r= new reverse();
	r.rev(num);
  }


}