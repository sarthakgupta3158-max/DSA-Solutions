import java.util.Scanner;

public class StringCompression {
    public static String compress(String s) {
        if (s.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == prev) {
                count++;
            } else {
                sb.append(prev).append(count);
                prev = curr;
                count = 1;
            }
        }
        sb.append(prev).append(count);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(compress(s));
    }
}