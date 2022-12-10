// read 3 int noum1 num2 num3
// 1 method return the minimum of 3 num
//1 method return the max of 3 num

import java.util.Scanner;

public class MinMaxMethods {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("enter first number");
        double num1 = Input.nextDouble();
        System.out.print("enter second number");
        double num2 = Input.nextDouble();
        System.out.print("enter third number");
        double num3 = Input.nextDouble();
        System.out.println("Lowest number is " + Lowest(num1,num2,num3));
        System.out.println("Highest number is " + Highest(num1,num2,num3));

    }
    static double Lowest(double x , double y , double z){
        //if (x < y && x < z){return x;}
        //if (y < x && y < z){return y;}
        return Math.min(Math.min(x,y),z);
    }
    static double Highest(double x , double y , double z){
        //if (x < y && x < z){return x;}
        //if (y < x && y < z){return y;}
        return Math.max(Math.max(x,y),z);
    }
}
