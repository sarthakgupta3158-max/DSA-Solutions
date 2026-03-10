*;

public class CountPairs {
    public static int countPairs(int[] arr, int target) {
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        for (int num : arr) {
            int complement = target - num;
            if (freq.containsKey(complement)) {
                count += freq.get(complement);
            }