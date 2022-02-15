package capter1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 세번째_문제 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String enterText = scanner.nextLine();
        String[] split = enterText.split(" ");

        String s = Arrays.stream(split)
                .max(Comparator.comparing(String::length))
                .orElse("");
        System.out.println(s);
    }
}
