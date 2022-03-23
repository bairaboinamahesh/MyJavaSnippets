import java.util.Scanner;

class saraAge
{
	public void age(int pd, int pm, int py, int by, int bm, int bd)
	{
		int tm[]=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
	     
		if(bd>pd)
		{
			pd=pd+30;
			pm=pm-1;
		}
		if(bm>pm)
		{
			pm=pm+12;
			py=py-1;
		}
		int d=pd-bd;
		int m=pm-bm;
		int y=py-by;
		System.out.println(y +"years" + m +" months "+ d + "days");
	}
	public static void main(String[] args){
	
	int pd=22, pm=03, py=2022;
	
 	Scanner sc= new Scanner(System.in);
	System.out.println("enter year");
     int by=sc.nextInt();
	System.out.println("enter month");
	int bm=sc.nextInt();
	System.out.println("enter date");
	int bd=sc.nextInt();
	
	saraAge sa= new saraAge();
	sa.age(pd, pm, py, by, bm, bd);

    }
}