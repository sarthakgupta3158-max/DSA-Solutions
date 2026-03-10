import java.util.*;

public class SecondSmallestLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements (space separated):");
        String[] tokens = sc.nextLine().split(" ");
        int[] arr = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        if (arr.length < 2) {
            System.out.println("Second Smallest : -1");
            System.out.println("Second Largest : -1");
            return;
        }
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second Smallest : " + (secondSmallest == Integer.MAX_VALUE ? -1 : secondSmallest));
        System.out.println("Second Largest : " + (secondLargest == Integer.MIN_VALUE ? -1 : secondLargest));
    }
}