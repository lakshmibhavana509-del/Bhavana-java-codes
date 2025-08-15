import java.util.Scanner;
public class NeonNumber
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        int b= a * a;
        int sum=0;
        int rem;
        while(b!=0)
        {
            rem=b%10;
            sum=sum+rem;
            b=b/10;
        }
        if(a==sum) {
            System.out.println(a);
        }
        else{
            System.out.println("Not a NeonNumber");
        }
    }
}