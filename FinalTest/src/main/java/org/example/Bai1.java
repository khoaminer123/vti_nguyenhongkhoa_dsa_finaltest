package org.example;

public class Bai1 {
    public static void main(String[] args) {
        String s = "Abcs12321421@$$%#@#@#$%#$$$#@#@";
        String result = removeSpecialLetters(s);
        System.out.println(result);

    }

    public static String removeSpecialLetters(String s) {
        String pattern = "[^a-zA-Z0-9]";
        String result = s.replaceAll(pattern, "");
        return result;
    }
}
