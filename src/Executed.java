import java.util.Scanner;

public class Executed {
    static void myMethod(String playerName){
        System.out.println(playerName + " just got executed!");
    }
    public static void main(String[] args) {
        String Player1;
        Scanner input = new Scanner(System.in);
        System.out.println("Insert player name");
        Player1 = input.next();
        myMethod(Player1);
    }
}
