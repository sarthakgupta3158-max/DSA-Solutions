import java.util.*;

public class MinimumDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] names = new String[n];
        int[] discounts = new int[n];
        int minDiscount = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(",");
            names[i] = parts[0];
            int price = Integer.parseInt(parts[1].trim());
            int discPercent = Integer.parseInt(parts[2].trim());
            int disc = price * discPercent / 100;
            discounts[i] = disc;
            if (disc < minDiscount) minDiscount = disc;
        }
        for (int i = 0; i < n; i++) {
            if (discounts[i] == minDiscount) {
                System.out.println(names[i]);
            }
        }
    }
}