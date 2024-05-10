import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //program for taking input from users and adding them
        System.out.print("Enter digit1= ");
        int digit1= input.nextInt();
        System.out.print("Enter digit2= ");
        int digit2= input.nextInt();
        System.out.println("Your Sum: "+(digit1+digit2));


    }
}