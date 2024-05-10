import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //program for taking input from users and adding them

        Scanner input = new Scanner(System.in);
        System.out.print("Enter digit1= ");
        int digit1= input.nextInt();
        System.out.print("Enter digit2= ");
        int digit2= input.nextInt();
        System.out.println("Your Sum: "+(digit1+digit2));


    }
}