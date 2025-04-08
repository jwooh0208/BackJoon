package ref;

import java.util.Scanner;

public class Num10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 0;
        int j = 0;
        int temp = 0;
        int[] arr = new int[n];

        for (int z = 0; z < n; z++) {
            arr[z] = z+1;
        }

        for (int z = 0; z < m; z++) {
            i = sc.nextInt();
            j = sc.nextInt();
            temp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;
        }

        for (int z = 0; z < n; z++) {
            System.out.println(arr[z]);
        }
    }
}
