import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements (space separated):");
        String[] tokens = sc.nextLine().split(" ");
        int[] nums = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) nums[i] = Integer.parseInt(tokens[i]);
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        rotate(nums, k);
        System.out.println("Rotated: " + Arrays.toString(nums));
    }
}