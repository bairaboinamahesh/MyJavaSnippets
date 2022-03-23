import java.util.Scanner;

class stringrev
{
  public void strev(String name)
	{
		String rev ="";
		int len = name.length();
		for(int i=len-1;i<=0;i--)
 		{
			rev= rev + name.charAT(i);
		}
			System.out.println(rev);			

	}
 public static void main(String[] args)
	{
		System.out.println("enter  name");			
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		stringrev sr = new stringrev();
		sr.strev(name);
	}	
}