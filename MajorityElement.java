import java.util.Scanner;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        // Boyer-Moore Voting
        int count = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements (space separated):");
        String[] tokens = sc.nextLine().split(" ");
        int[] nums = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) nums[i] = Integer.parseInt(tokens[i]);
        System.out.println("Majority element: " + majorityElement(nums));
    }
}