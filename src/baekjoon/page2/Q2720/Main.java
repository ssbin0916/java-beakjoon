package baekjoon.page2.Q2720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        for (int i = 0; i < number; i++) {
            int cent = Integer.parseInt(br.readLine());
            calculateExchange(cent);
        }
    }

    private static void calculateExchange(int cent) {

        int quarter = cent / 25;
        cent %= 25;

        int dime = cent / 10;
        cent %= 10;

        int nickel = cent / 5;
        cent %= 5;

        int penny = cent;

        System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
    }
}