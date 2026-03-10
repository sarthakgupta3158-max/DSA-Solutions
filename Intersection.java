import java.util.*;

public class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) set1.add(num);
        Set<Integer> intersect = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) intersect.add(num);
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (int num : intersect) result[i++] = num;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array:");
        String[] s1 = sc.nextLine().split(" ");
        int[] nums1 = new int[s1.length];
        for (int i = 0; i < s1.length; i++) nums1[i] = Integer.parseInt(s1[i]);
        System.out.println("Enter second array:");
        String[] s2 = sc.nextLine().split(" ");
        int[] nums2 = new int[s2.length];
        for (int i = 0; i < s2.length; i++) nums2[i] = Integer.parseInt(s2[i]);
        int[] res = intersection(nums1, nums2);
        System.out.println("Intersection: " + Arrays.toString(res));
    }
}