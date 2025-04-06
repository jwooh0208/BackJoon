package ref;

import java.util.Scanner;

public class Num5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] student = new int[30];
        int count = 0;
        for (int i = 0; i < student.length-2; i++) {
            student[i] = sc.nextInt();
        }
        int[] student2 = new int[30];
        for (int i = 0; i < student2.length; i++) {
            student2[i] = i+1;
        }

    }
}
