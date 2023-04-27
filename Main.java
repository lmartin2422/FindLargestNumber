import java.util.*;

public class Main {
    public static void main(String[] args) {

        int num1, num2, num3;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers separated by a space:");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        System.out.println("num1 = " +num1+ " num2 = " +num2+ " num3 = " + num3);
        System.out.println();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Num1 is the largest number");
        }

        else if (num2 > num1 && num2 > num3) {
            System.out.println("Num2 is the largest number");
        }
        else if (num3 > num1 && num3 > num1) {
            System.out.println("Num3 is the largest number");
        }
        else
            System.out.println("There is a duplicate number");
    }
}