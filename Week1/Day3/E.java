import java.util.Scanner;

public class E {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        String uname,pass;
        do{
            System.out.print("Enter username:");
            uname=sc.next();
            
            System.out.print("Enter password:");
            pass=sc.next();

            System.out.println(uname+"  "+pass);

        }while(!(uname.equals("UserName") && pass.equals("Password")));

        System.out.println("Credentials validated");
    }
    
}
