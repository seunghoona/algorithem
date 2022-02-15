package capter1;

import java.util.Scanner;

public class 첫번째문제 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String text = scanner.nextLine();
        final String character = scanner.nextLine();
        long matchCount = matchCount(text, character);
        System.out.println(matchCount);
    }

    private static int matchCount(String text, String enterMatchText) {
        int answer = 0;
        final char aText = enterMatchText.charAt(0);
        char upperAText = Character.toUpperCase(aText);
        for (char x : text.toUpperCase().toCharArray()) {
            if (x == upperAText) answer ++;
        }
        return answer;
    }


}
