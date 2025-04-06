package ref;

import java.util.Scanner;

public class Num1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] temp = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                    temp[i] = str.charAt(i);
                }
            }
    }
}
