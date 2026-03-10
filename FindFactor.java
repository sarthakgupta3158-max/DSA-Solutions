import java.util.ArrayList;
import java.util.Scanner;

public class FindFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        if (num == 0) {
            System.out.println("No Factors");
            return;
        }
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors.add(i);
        }
        for (int i = 0; i < factors.size(); i++) {
            System.out.print(factors.get(i));
            if (i < factors.size() - 1) System.out.print(",");
        }
    }
}