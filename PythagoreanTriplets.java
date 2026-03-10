import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int limit = sc.nextInt();
        for (int a = 1; a <= limit; a++) {
            for (int b = a + 1; b <= limit; b++) {
                int c = (int) Math.sqrt(a * a + b * b);
                if (c <= limit && a * a + b * b == c * c) {
                    System.out.println(a + " " + b + " " + c);
                }
            }
        }
    }
}