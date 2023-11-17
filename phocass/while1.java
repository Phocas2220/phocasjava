import java.util.Scanner;

class while1
{
     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in); 
        System.out.println("100 ");
        int n=sc.nextInt();
        int i=1;
        System.out.println("The multiplication table of "+n+" is: ");
        while(i<=10)
        {
           System.out.println(n+" * "+i+" = "+ (n*i));
               i++;
        }
     }
}