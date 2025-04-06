package ref;

import java.util.Scanner;

public class FirstWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        char[] num = new char[str.length()];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                num[j] = words[i].charAt(j);
                if (j == 0) {
                    num[j] += -32;
                }
                System.out.print(num[j]);
            }
            System.out.print(" ");
        }
    }
}
