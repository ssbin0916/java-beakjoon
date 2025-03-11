package baekjoon.page2.Q2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= number; i++) {
            deque.add(i);
        }

        while (deque.size() > 1) {
            deque.poll();
            deque.addLast(deque.poll());
        }

        System.out.println(deque.poll());
    }
}
