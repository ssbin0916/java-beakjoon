package baekjoon.page19.Q19944;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int newbie = 2;

        if (M <= newbie) {
            System.out.println("NEWBIE!");
        } else if (M <= N && M > newbie) {
            System.out.println("OLDBIE!");
        } else {
            System.out.println("TLE!");
        }
    }
}
