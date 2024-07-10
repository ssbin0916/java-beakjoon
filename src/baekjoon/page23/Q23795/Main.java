package baekjoon.page23.Q23795;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> gamble = new ArrayList<>();

        while (n != -1) {
            gamble.add(n);
            n = scanner.nextInt();
        }

        int total = 0;

        for (Integer integer : gamble) {
            total += integer;
        }
        System.out.println(total);
    }
}
