
import java.util.Scanner;

public class SmallestNumber {

    public static double findSmallest(double a, double b, double c) {
        if (a <= b && a <= c)
            return a;
        else if (b <= a && b <= c)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double a = sc.nextDouble();

        System.out.print("Input the Second number: ");
        double b = sc.nextDouble();

        System.out.print("Input the third number: ");
        double c = sc.nextDouble();

        System.out.println("The smallest value is "
                + findSmallest(a, b, c));

        sc.close();
    }
}