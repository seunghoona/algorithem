package capter1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class 중복문자제거 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        char[] chars = s.toCharArray();
        String answer = "";
        for (char aChar : chars) {
            if (answer.indexOf(aChar) == -1) {
                answer += aChar;
            }
        }
        System.out.println(answer);
    }
}
