import java.util.*;

public class FirstNonRepeated {
    public static Character firstNonRepeated(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) freq[c]++;
        for (char c : s.toCharArray()) {
            if (freq[c] == 1) return c;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Character result = firstNonRepeated(s);
        System.out.println(result == null ? "No non-repeated character" : result);
    }
}