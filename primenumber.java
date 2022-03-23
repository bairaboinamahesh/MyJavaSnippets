import java.util.Scanner;

public class primenumber
{
  public static void prime(int num)
  {
    int count=0;
    if(num !=0 && num != 1)
    {
       for(int i=2; i<num; i++)
       {
        if(num % i != 0)
         count++;
        System.out.println("petindi");
       }
        if (count== num-2 ) 
        System.out.println(num+ "prime");
        else
        System.out.println(num+ "not prime");
    }
  
  }
 
 public static void secondprime(int num) 
 { 
  int count=0;
  if(num == 0|| num == 1)
  {
  System.out.println(num+"not prime");
  }
  else
  {
  for(int i=2;i<num;i++)
   {  
  if(num % i == 0)
  count++;
   System.out.println("petindi 2");	
 }
 if(count == 0)
 System.out.println(num+"prime");
 else
 System.out.println(num+"not prime");
 }
}


 public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     primenumber pb=new primenumber();
      int num=sc.nextInt();
     pb.prime(num);
     pb.secondprime(sc.nextInt());
     
   }

}






