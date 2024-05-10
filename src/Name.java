import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner v= new Scanner(System.in);


//program for taking name of a user storing them as a variable and printing that variable
        System.out.print("enter name: ");
        String name= v.nextLine();//here input is being taken
        System.out.println("Your Name: "+name);


//program to get username and age and print them
        Scanner o = new Scanner(System.in);
        System.out.print("Enter your name and age: ");
        System.out.println(o.nextLine()+"! and you are "+o.nextInt()+" years old!!!");
    }
}
