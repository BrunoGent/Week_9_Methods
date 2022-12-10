import java.sql.SQLOutput;

public class FibonacciCalc {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Fibonacci(i));
        }
    }
    static long Fibonacci(int Times){
        if (Times < 0) return Times;
        return Fibonacci(Times - 1) + Fibonacci(Times - 2);
            }
}
