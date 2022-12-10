//Read 2 numbers and then create 1 method for each operation  + - * /
import java.util.Scanner;
public class MyCalculator {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("enter first number");
        double num1 = Input.nextDouble();
        System.out.print("enter second number");
        double num2 = Input.nextDouble();
        //print results
        System.out.println("result of addition is " + Addition(num1,num2));
        System.out.println("result of subtraction is " + Subtraction(num1,num2));
        System.out.println("result of division is " + Division(num1,num2));
        System.out.println("result of multiplication is " + Multiplication(num1,num2));
    }

    static double Addition(double x , double y) {
        return x+y;
    }

    static double Subtraction(double x , double y) {

        return x-y;
    }

    static double Division(double x , double y) {
        if (y == 0){
            System.out.println("Cannot divide by zero");return 0;}
        return x/y;
    }
    static double Multiplication(double x , double y) {
        return x*y;
    }
}