package ref;

import java.util.Scanner;
//바구니를 총 5개 가지고 있고
//바구니는 1번부터 5번까지 번호가 매개져있다
//1번~5번까지 번호가 적혀있는 공을 매우 많이 가지고 있다.
//4번 공을 넣으려고 한다
//한번 공을 넣을 때 공을 넣을 바구니 범위를 정하고
public class Num10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr = new int[n];

        for (int z = 0; z < m; z++) {
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();
            for (int a = i-1; a < j; a++) {
                arr[a] = k;
            }
        }
        for (int z = 0; z < n; z++) {
            System.out.println(arr[z]);
        }
    }
}
