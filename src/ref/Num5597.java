package ref;

import java.util.Scanner;

//기억 안나서 답안지 봄 다시 해볼 것

public class Num5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] student = new int[31];

        for (int i = 1; i < 29; i++) {
            int s = sc.nextInt();
            student[s] = 1;
        }
        for (int i = 1; i < student.length; i++) {
            if (student[i] != 1) {
                System.out.println(i);
            }
        }
    }
}
