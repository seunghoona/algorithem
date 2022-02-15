package capter1;

import java.util.Scanner;

public class 특정문자_뒤집기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enterText = scanner.nextLine();

        char[] chars = enterText.toCharArray();

        int first = 0;
        int end = chars.length - 1;
        while (first < end) {
            if (!Character.isAlphabetic(chars[first])) {
                first++;
            } else if (!Character.isAlphabetic(chars[end])) {
                end--;
            } else {
                char temp = chars[end];
                chars[end] = chars[first];
                chars[first] = temp;
                first++;
                end--;
            }
        }

        System.out.println(String.valueOf(chars));
    }
}
