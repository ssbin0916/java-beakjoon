package baekjoon.page1.Q1152;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        scanner.close();

        StringTokenizer st = new StringTokenizer(str, " ");

        System.out.println(st.countTokens());

    }
}
