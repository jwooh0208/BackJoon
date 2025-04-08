package ref;

import java.util.Scanner;

public class Num10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        int search = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (scores[i] == search) {
                count++;
            }
        }
        System.out.println(count);
    }
}
