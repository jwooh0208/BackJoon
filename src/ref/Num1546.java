package ref;

import java.util.Scanner;

public class Num1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        int maxScore = Integer.MIN_VALUE;
        double totalScore = 0;
        double[] newScores = new double[n];
        double avgScore = 0;
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }
        for (int i = 0; i < n; i++) {
            newScores[i] = (double) scores[i]/maxScore*100;
            totalScore += newScores[i];
            avgScore = totalScore / n;
        }
        System.out.println(avgScore);
    }
}
