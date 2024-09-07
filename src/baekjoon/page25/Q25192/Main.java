package baekjoon.page25.Q25192;

import java.io.*;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        String[] chats = new String[number];

        for (int i = 0; i < number; i++) {
            chats[i] = br.readLine();
        }

        int count = 0;
        HashSet<String> users = new HashSet<>();

        for (int i = 0; i < number; i++) {
            if (chats[i].equals("ENTER")) {
                users.clear();
                continue;
            }

            if (!users.contains(chats[i])) {
                users.add(chats[i]);
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
