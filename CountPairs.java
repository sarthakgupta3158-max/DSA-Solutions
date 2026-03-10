import java.util.*;

public class CountPairs {
    public static int countPairs(int[] arr, int target) {
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        for (int num : arr) {
            int complement = target - num;
            if (freq.containsKey(complement)) {
                count += freq.get(complement);
            }
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements (space separated):");
        String[] tokens = sc.nextLine().split(" ");
        int[] arr = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) arr[i] = Integer.parseInt(tokens[i]);
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        System.out.println("Number of pairs: " + countPairs(arr, target));
    }
}