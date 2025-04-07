package ref;

import java.util.Scanner;

public class Num10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = new char[str.length()];
        boolean check = false;
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
            check = chars[i] == chars[str.length() - 1 - i];
        }

        if (check) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
