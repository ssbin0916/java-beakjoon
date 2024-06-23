package baekjoon.Lv4.Q5597;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] students = new int[31];

        for (int i = 1; i < 29; i++) {
            int studentNumber = scanner.nextInt();
            students[studentNumber] = 1;
        }

        int missingCount = 0;
        int[] missingStudents = new int[2];

        for (int i = 1; i < students.length; i++) {
            if (students[i] != 1) {
                missingStudents[missingCount] = i;
                missingCount++;
            }
        }

        System.out.println(missingStudents[0]);
        System.out.println(missingStudents[1]);
    }
}
