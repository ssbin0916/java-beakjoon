package baekjoon.page10.Q10773;

import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(br.readLine());

            if (number == 0 && !stack.isEmpty()) {
                stack.pop();
            } else if (number != 0) {
                stack.push(number);
            }
        }

        int sum = stack.stream().mapToInt(Integer::intValue).sum();
        bw.write(sum + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
