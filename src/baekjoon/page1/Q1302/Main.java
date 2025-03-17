package baekjoon.page1.Q1302;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> bestseller = new HashMap<>();

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String book = br.readLine();
            bestseller.put(book, bestseller.getOrDefault(book, 0) + 1);
        }

        int maxCount = Collections.max(bestseller.values());

        List<String> mostFrequentBooks = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : bestseller.entrySet()) {
            if (entry.getValue() == maxCount) {
                mostFrequentBooks.add(entry.getKey());
            }
        }

        Collections.sort(mostFrequentBooks);

        System.out.println(mostFrequentBooks.get(0));
    }
}