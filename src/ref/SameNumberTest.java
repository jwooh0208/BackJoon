package ref;

import java.util.Scanner;

public class SameNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        char[] num = new char[number.length()];
        if (number.length() == 1) {
            System.out.println("한자리 수 입니다.");
        }
        boolean chcek = false;
        for (int i = 0; i < number.length(); i++) {
           num[i] = number.charAt(i);
        }

        for (int i = 1; i < number.length(); i++) {
                if (num[i-1] == num[i]) {
                    chcek = true;
                } else {
                    chcek = false;
                    break;
                }
            }
        if (chcek) {
            System.out.println("같은 수로만 이루어져 있습니다.");
        } else {
            System.out.println("같은 수로 이루어져 있지 않습니다.");
        }
    }
}
