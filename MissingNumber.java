import java.util.Scanner;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) sum += num;
        return total - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements (space separated):");
        String[] tokens = sc.nextLine().split(" ");
        int[] nums = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            nums[i] = Integer.parseInt(tokens[i]);
        }
        System.out.println("Missing number: " + missingNumber(nums));
    }
}