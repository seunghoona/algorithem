package capter1;

import java.util.Scanner;

public class 두번째_문제 {


    public static void main(String[] args) {
        String convert = convert(Input.enter());
        System.out.println(convert);

    }

    private static String convert(String enter) {
        final char[] chars = enter.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int aChar : chars ) {
            lower(sb, aChar);
            upper(sb, aChar);
        }
        return sb.toString();
    }

    private static void lower(StringBuilder sb, int aChar) {
        if (aChar >= 65  && aChar <= 90) {
            sb.append( Character.toLowerCase(aChar));
        }
    }

    private static void upper(StringBuilder sb, int aChar) {
        if (aChar >= 97  && aChar <= 122) {
            sb.append(Character.toUpperCase(aChar));
        }
    }

    static class Input {
        private static final Scanner scanner = new Scanner(System.in);
        private final static int LIMIT_TEXT_SIZE = 100;
        public static String enter() {
            final String enterText = scanner.nextLine();
            validTextSizeLIMIT(enterText);
            return enterText;
        }

        private static void validTextSizeLIMIT(String text) {
            final int textSize = text.length();
            if (textSize > LIMIT_TEXT_SIZE) {
                throw new IllegalArgumentException();
            }
        }
    }
}
