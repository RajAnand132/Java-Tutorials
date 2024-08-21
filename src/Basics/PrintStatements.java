package Basics;

import java.util.Scanner;

public class PrintStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // To take input from user

        System.out.println("Enter the number: ");
        int input = sc.nextInt(); // To store the user typed value

        System.out.println("Output from dynamic input: "+input);

        System.out.println("Integer:"+0); //Integer
        System.out.println("Float:"+6);//Float
        System.out.println("Double:"+0.5543);//Double
        System.out.println("Char:"+'c');//Char
        System.out.println("String:"+"Manish");//String
        System.out.println("Boolean:"+true);//Boolean
    }
}
