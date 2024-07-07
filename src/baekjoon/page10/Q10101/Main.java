package baekjoon.page10.Q10101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if ((a + b + c) != 180) {
            System.out.println("Error");
        } else if (a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a == b || a == c || b == c){
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
