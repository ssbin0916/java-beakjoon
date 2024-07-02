package baekjoon.page5.Q5543;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] burgers = new int[3];
        int[] sodas = new int[2];

        int burgerMin = 0;
        int sodaMin = 0;

        for (int i = 0; i < 3; i++) {
            burgers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 2; i++) {
            sodas[i] = scanner.nextInt();
        }

        burgerMin = burgers[0];
        sodaMin = sodas[0];

        for (int i = 1; i < 3; i++) {
            if (burgers[i] < burgerMin) {
                burgerMin = burgers[i];
            }
        }

        for (int i = 1; i < 2; i++) {
            if (sodas[i] < sodaMin) {
                sodaMin = sodas[i];
            }
        }

        int set = burgerMin + sodaMin - 50;
        System.out.println(set);
    }
}
