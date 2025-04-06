package ref;


public class Decimal {
    public static void main(String[] args) {
        int[] num = new int[100];
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    num[i-1] += j;
                }
            }
            if (num[i-1] == i+1) {
                System.out.print(i+" ");
            }
        }
    }
}
