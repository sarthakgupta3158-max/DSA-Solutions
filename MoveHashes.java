import java.util.Scanner;

public class MoveHashes {
    public static String moveHashToFront(String s) {
        StringBuilder hashes = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                hashes.append(c);
            } else {
                others.append(c);
            }
        }
        return hashes.toString() + others.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        System.out.println("Result: " + moveHashToFront(s));
    }
}