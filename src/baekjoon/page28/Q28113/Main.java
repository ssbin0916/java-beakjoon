package baekjoon.page28.Q28113;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();


        if (N <= B && A == B) {
            System.out.println("Anything");
        } else if (N <= B && B - A > 0) {
            System.out.println("Bus");
        } else {
            System.out.println("Subway");
        }
    }
}