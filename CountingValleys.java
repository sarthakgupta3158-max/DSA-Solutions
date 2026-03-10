import java.util.Scanner;

public class CountingValleys {
    public static int countValleys(String steps) {
        int altitude = 0;
        int valleys = 0;
        boolean inValley = false;
        for (char c : steps.toCharArray()) {
            if (c == 'U') altitude++;
            else altitude--;
            if (altitude < 0 && !inValley) {
                valleys++;
                inValley = true;
            }
            if (altitude >= 0) inValley = false;
        }
        return valleys;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String steps = sc.nextLine();
        System.out.println(countValleys(steps));
    }
}