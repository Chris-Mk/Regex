import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        int num4 = Integer.parseInt(scan.nextLine());

        int sum = num1 + num2;
        int quotient = sum / num3;
        int product = quotient * num4;

        System.out.println(product);
    }
}
