import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt(); // ignored
        int result = (a + b) * (a + b) * (a + b);
        System.out.println("Result: " + result);
    }
}