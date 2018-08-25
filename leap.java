import java.util.Scanner;
class l5code2
{
public static void main(String[] args)
{
	
  System.out.print("enter year");
  Scanner a=new Scanner(System.in);
  int s=a.nextInt();
  if(s % 4 == 0)
  {
    if( s % 100 == 0)
{
     if(s%400==0)
System.out.print("leap year");
else
System.out.print("1not a leap year");
}	
else
System.out.print("leap year");
  }
  else
System.out.print("not a leap year");
}
}