import java.util.Scanner;
 public class Main  {
    public static void main(String[] args) {
       calculations();
       login();
         
     }
     static void login() {
         Scanner sc=new Scanner(System.in);
         String username="bhavana";
         String password="bhavana@1919";
         System.out.println("Enter your username");
         String username1=sc.nextLine();
          System.out.println("Enter password");
          String password1=sc.nextLine();
          if(username==password){
              System.out.println("hello"+username+"welcome to basic calculator" );
          }
          else{
                  System.out.println("username and password are not match");
              }
     }
              static void calculations(){
               Scanner sc=new Scanner(System.in);    
        char operator=sc.next().charAt(0);
        System.out.println("enter a");
        int a=sc.nextInt();
         System.out.println("enter b");
        int b=sc.nextInt();
        int c;
        switch(operator){
            case '+':c=a+b;
                System.out.println("addition"+c);
                break;
            case '-':c=a-b;
                System.out.println("substraction"+c);
                 break;
            case '*':c=a*b;
                System.out.println("multiplication"+c);
                 break;
            case '/':c=a/b;
                System.out.println("division"+c);
                 break;
            case '%':c=a%b;
                System.out.println("modulo"+c);
                 break;
        
            default:
            System.out.println("please enter number between 1 to 5");
        }
              }
          
 }
    