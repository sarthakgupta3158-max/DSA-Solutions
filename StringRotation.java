import java.util.Scanner;

public class StringRotation {
    public static boolean isRotation(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String goal = sc.nextLine();
        System.out.println(isRotation(s, goal));
    }
}