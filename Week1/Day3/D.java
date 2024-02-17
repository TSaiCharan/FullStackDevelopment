import java.util.Scanner;

public class D {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int num=20;

        System.out.println("Enter your guess number");
        int user_num=sc.nextInt();

        while(num!=user_num){
            if(num>user_num) System.out.println("You guessed too low");
            else System.out.println("You guessed too high");

            System.out.println("Enter your new guess number");
            user_num=sc.nextInt();
    
        }
        System.out.println("You guessed correct number");

    }
    
}
