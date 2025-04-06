package ref;

import java.util.Scanner;

public class Num1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        int max = Integer.MIN_VALUE;
        double newScore = 0;
        double totalScore = 0;
        double avg = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            if (score[i] > max) {
                max = score[i];
            }
        }
    }
}
