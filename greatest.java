import java.util.Scanner;
class greatest
{
public static void main(String[] args)
{
 Scanner s=new Scanner(System.in);
int a=s.nextInt();
Scanner v=new Scanner(System.in);
int b=v.nextInt();
Scanner o=new Scanner(System.in);
int c=o.nextInt();
int z;
z=(a>b)?((a>c)?a:c):((b>c)?b:c);
System.out.print("greatest number is "+z);
}}
