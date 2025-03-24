package baekjoon.page10.Q10845;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int[] queue;
    public static int front = 0;
    public static int rear = 0;
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int number = Integer.parseInt(br.readLine());
        queue = new int[number];

        while (number-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
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
            if (command.equals("front")) {
                sb.append(front()).append(System.lineSeparator());
            }
            if (command.equals("back")) {
                sb.append(back()).append(System.lineSeparator());
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static void push(int value) {
        queue[rear++] = value;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        }
        size--;
        return queue[front++];
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        }
        return 0;
    }

    public static int front() {
        if (size == 0) {
            return -1;
        }
        return queue[front];
    }

    public static int back() {
        if (size == 0) {
            return -1;
        }
        return queue[rear - 1];
    }
}