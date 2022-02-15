package capter1;

import java.util.Scanner;

public class 숫자만추출 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String answer = "";
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                answer += aChar;
            }
        }
        System.out.println(Integer.parseInt(answer));
    }
}
