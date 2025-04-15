package ref;

import java.util.Scanner;

public class Num1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.trim().split(" ");
        int count = str1.length;
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < i; j++) {
                if (str1[j].equals(str1[i])) {
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
