package baekjoon.page4.Q4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        for (int i = 0; i < number; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int studentCount = Integer.parseInt(st.nextToken());
            int[] scores = new int[studentCount];
            int sum = 0;

            for (int j = 0; j < studentCount; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                sum += scores[j];
            }

            double average = (double) sum / studentCount;
            int aboveAverageCount = 0;

            for (int score : scores) {
                if (score > average) {
                    aboveAverageCount++;
                }
            }

            double percentage = ((double) aboveAverageCount / studentCount) * 100;
            System.out.printf("%.3f%%\n", percentage);
        }
    }
}
