import java.util.Scanner;

public class DealershipTyres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of dealerships: ");
        int n = sc.nextInt();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int cars = sc.nextInt();
            int bikes = sc.nextInt();
            result[i] = cars * 4 + bikes * 2;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
