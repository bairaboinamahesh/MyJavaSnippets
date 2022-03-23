import java.util.Scanner;
class fibonacci
{ 

 public static void fib()
 {
 
  int num1=0, num2=1, num3=0 ;
  System.out.println(num1+""+num2);
  for(int i = 1 ; i < fibonacci.num; i++)
   {
 	num3 = num1 + num2;
  	System.out.print(" "+num3);
  	num1 = num2;
  	num2 = num3;
   }
 
 }


public static void main(String[] args)
 {
   Scanner sc= new Scanner(System.in);
   Static int num = sc.nextInt(); 
   fibonacci f= new fibonacci();
   f.fib();


 }






}