import java.util.Scanner;

class agecalc
{

public void years(int year)
{
   int years =  year-2022;
   System.out.println("year=" + years);

}

public void months(int month,int year)
{  int pmonths=3;
   int dpmonths = 0;
   int months=0;
   if(month > pmonths )
    {
          dpmonths = pmonths + 1;
	     months =  month - dpmonths;
		years( year + 1);
		
	System.out.println("month=" + months);
    }
   else
    {
 	  months =  month - pmonths;
	   ;
      System.out.println("month=" + months);
    }
}

public void dates(int date, int month,int year)
{
   int y, pdates = 22 ;
   int ppdates = 0;
   int dates=0;
   if(date > pdates)
    {
          ppdates = pdates + 30;
	     dates =  date - ppdates;
		  y = month + 1 ;
		months( y,year);
	System.out.println("date=" + dates);
    }
   else
   {
	dates =  date- pdates;
	months( dates,year)
   System.out.println("date=" + dates);
   }
}

public static void main(String[] args)
{
 	Scanner sc= new Scanner(System.in);
	System.out.println("enter year");
    	int year=sc.nextInt();
	System.out.println("enter month");
	int month=sc.nextInt();
	System.out.println("enter date");
	int date=sc.nextInt();
	agecalc ac= new agecalc();
	//ac.years(year);
	//ac.months(month);
	ac.dates(date, month, year);


}

}


















