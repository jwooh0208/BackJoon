package ref;

import java.util.Scanner;

public class BackWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        char[] num = new char[str.length()];
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length()-1; j >= 0; j--) {
                num[j] = words[i].charAt(j);
                System.out.print(num[j]);
            }
            System.out.print(" ");
        }
    }
}
