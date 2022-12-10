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
        if (num1 % 1 == 0 && num2 % 1 == 0 && num3 % 1 == 0) {
            System.out.println("Lowest number is " + Lowest((int)num1, (int)num2, (int)num3));
            System.out.println("Highest number is " + Highest((int)num1, (int)num2, (int)num3));
        }
        else {
            System.out.println("Lowest number is " + Lowest(num1, num2, num3));
            System.out.println("Highest number is " + Highest(num1, num2, num3));
        }
    }
    static double Lowest(double x , double y , double z){
        return Math.min(Math.min(x,y),z);
    }
    static double Highest(double x , double y , double z){
        return Math.max(Math.max(x,y),z);
    }
    static int Lowest(int x , int y , int z){
        return Math.min(Math.min(x,y),z);
    }
    static int Highest(int x , int y , int z){
        return Math.max(Math.max(x,y),z);
    }
}
