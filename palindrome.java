import java.util.Scanner;
class palindrome {

    public static void main(String[] args) {

        int  z= 0, r, o;
           Scanner s=new Scanner(System.in);
          int a=s.nextInt();
        o=a;

        
        while( a!= 0 )
        {
            r= a % 10;
             z= z * 10 + r;
             a /= 10;
        }

        
        if (o==z)
            System.out.println("palindrone");
        else
            System.out.println("not");
    }
}