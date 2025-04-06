package ref;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                num += i;
            }
        }
        if (num == n) {
            System.out.println("완전수");
        } else {
            System.out.println("완전수 아님");
        }
    }
}
