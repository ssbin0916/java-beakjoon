package baekjoon.page9.Q9498;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt(); // Removed the unnecessary closing parenthesis
        scanner.close();

        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score < 90) {
            System.out.println("B");
        } else if (score >= 70 && score < 80) {
            System.out.println("C");
        } else if (score >= 60 && score < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
