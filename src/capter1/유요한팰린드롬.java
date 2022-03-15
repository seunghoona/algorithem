package capter1;

import java.util.Scanner;

public class 유요한팰린드롬 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String enterText = in.nextLine();
        String resultText = enterText.replaceAll("[^a-zA-Z]","");

        int matchCount = 0;

        char[] alphabet = resultText.toUpperCase().toCharArray();
        int length = resultText.length();
        for (int i = 0; i < length / 2; i++) {
            if (alphabet[i] == alphabet[length - (i + 1)]) {
                matchCount++;
            }
        }

        String result = matchCount == length / 2 ? "YES" : "NO";
        System.out.println(result);
    }
}
