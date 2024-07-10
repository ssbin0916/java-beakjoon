package baekjoon.page14.Q14489;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int total = A + B;

        int price = scanner.nextInt();
        int quantity = 2;
        int totalPrice = price * quantity;

        int result = 0;

        if (total >= totalPrice) {
            result = total - totalPrice;
            System.out.println(result);
        } else {
            result = total;
            System.out.println(result);
        }
    }
}
