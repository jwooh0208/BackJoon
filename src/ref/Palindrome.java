package ref;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = new char[str.length()];
        boolean check = false;

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            if (ch[i] == str.charAt(str.length() - 1 - i)) {
                check = true;
            } else {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("회문O");
        } else {
            System.out.println("회문X");
        }
    }
}
