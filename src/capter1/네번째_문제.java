package capter1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 네번째_문제 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String enterLimitNumber = scanner.nextLine();
        int i1 = Integer.parseInt(enterLimitNumber);

        String[] str = new String[i1];
        for (int i = 0; i < i1; i++) {
            str[i] = scanner.nextLine();
        }
        reverse(str).forEach(System.out::println);
    }

    private static List<String> reverse(String[] str) {
        return Arrays.stream(str)
                .map(네번째_문제::reverse)
                .collect(Collectors.toList());
    }

    private static String reverse(String s) {
        int first = 0;
        int end = s.length() -1;
        char[] chars = s.toCharArray();
        while(first < end) {

            char temp = chars[end];
            chars[end] = chars[first];
            chars[first] = temp;
            first++;
            end--;
        }
        return String.valueOf(chars);
    }

}
