package Basics;

public class Conditional {
    public static void main(String[] args) {

//        int num1 = 45;
//        int num2 = 245;
//        int num3 = 5;
//
//        if(num1<num2){System.out.println("num2 is greater");}
//
//
//        //if else
//
//        if(num2 >num1)
//        {
//            System.out.println("Num2 is greater than num1");
//        }
//        else
//            System.out.println("num1 is greater");
//
//
//        // if elseif ==> elif
//        if(num1> num2 && num1>num3){
//            System.out.println("Greater number: num1 "+ num1);
//        }
//        else if (num2> num1 && num2 > num3){
//            System.out.println("Greater number: num2 "+ num2);
//        }
//        else
//            System.out.println("Greater number: num3 "+ num3);
//
//
//        // Ternary
//
//        System.out.println(num1>num1 ? "Num1 is greater":"Num2 is greater");
//

        // nested if


        int age = 25;
        boolean hasID = true;

        if (age >= 18) {
            // First condition: Age check
            if (hasID) {
                // Nested condition: ID check
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You need an ID to vote.");
            }
        } else {
            System.out.println("You are not old enough to vote.");
        }

    }
}
