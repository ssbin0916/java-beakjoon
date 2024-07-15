package baekjoon.page5.Q5565;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int books = Integer.parseInt(br.readLine());
        int bookCount = 9;
        int total = 0;

        for (int i = 0; i < bookCount; i++) {
            int book = Integer.parseInt(br.readLine());
            total += book;
        }

        int result = books - total;

        System.out.println(result);
    }
}
