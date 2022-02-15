package capter1;

import java.util.Scanner;

public class 회문문자열 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final String enterText = scanner.nextLine();
        RollText rollText = new RollText(enterText);

        rollText.check();
        System.out.println(rollText.print());

    }

    static class RollText {
        private int first;
        private int end;
        private int matchCount;
        private char[] texts;

        public RollText(String enterText) {
            this.first = 0;
            this.end = enterText.length() - 1;
            this.matchCount = 0;
            this.texts = enterText.toUpperCase().toCharArray();
        }

        public void check() {
            while (first < end) {
                if (validIsNotMatch()) break;
                matchCount++;
                first++;
                end--;
            }
        }

        private boolean validIsNotMatch() {
            return texts[first] != texts[end];
        }

        public String print() {
            final int textLength = texts.length / 2;
            return matchCount == textLength ?
                    "YES"
                    : "NO";
        }
    }
}
