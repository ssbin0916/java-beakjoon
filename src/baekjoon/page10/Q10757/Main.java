package baekjoon.page10.Q10757;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();
        scanner.close();

        BigInteger result = A.add(B);

        System.out.println(result);
    }
}
