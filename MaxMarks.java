import java.util.Scanner;

public class MaxMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of semester: ");
        int sem = sc.nextInt();
        int[] subjects = new int[sem];
        for (int i = 0; i < sem; i++) {
            System.out.print("Enter no of subjects in " + (i + 1) + " semester: ");
            subjects[i] = sc.nextInt();
        }
        int[] maxMarks = new int[sem];
        boolean invalid = false;
        for (int i = 0; i < sem; i++) {
            System.out.print("Marks obtained in semester " + (i + 1) + ": ");
            int max = -1;
            for (int j = 0; j < subjects[i]; j++) {
                int mark = sc.nextInt();
                if (mark < 0 || mark > 100) {
                    invalid = true;
                }
                if (mark > max) max = mark;
            }
            maxMarks[i] = max;
        }
        if (invalid) {
            System.out.println("You have entered invalid mark.");
        } else {
            for (int i = 0; i < sem; i++) {
                System.out.println("Maximum mark in " + (i + 1) + " semester: " + maxMarks[i]);
            }
        }
    }
}