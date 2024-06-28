package baekjoon.Q25314;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = "";
        scanner.close();
        if (n % 4 == 0) {
            for (int i = 0; i < n / 4; i++) {
                str += "long ";
            }
            System.out.println(str + "int");
        }
    }
}