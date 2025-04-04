package baekjoon.page1.Q1453;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");

        Set<String> seats = new HashSet<>(Arrays.asList(input));

        int rejected = number - seats.size();
        System.out.println(rejected);
    }
}