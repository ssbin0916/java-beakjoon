package baekjoon.page10.Q10828;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        stack = new int[N];

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            String command = st.nextToken();

            if (command.equals("push")) {
                push(Integer.parseInt(st.nextToken()));
            }

            if (command.equals("pop")) {
                sb.append(pop()).append(System.lineSeparator());
            }

            if (command.equals("size")) {
                sb.append(size()).append(System.lineSeparator());
            }

            if (command.equals("empty")) {
                sb.append(empty()).append(System.lineSeparator());
            }

            if (command.equals("top")) {
                sb.append(top()).append(System.lineSeparator());
            }
        }
        System.out.println(sb);
    }

    public static void push(int item) {
        stack[size] = item;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        } else {
            int res = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return res;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int top() {
        if (size == 0) {
            return -1;
        } else {
            return stack[size - 1];
        }
    }

}