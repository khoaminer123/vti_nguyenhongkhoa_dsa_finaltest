package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Bai2 {
    public static void main(String[] args) {
        int n = 123432;
        int n1[] = {1, 2, 3, 4, 3, 2};

        if (Bai2_1(n)) {
            System.out.println("- Bai2_1: Day la mang doi xung");
        } else {
            System.out.println("- Bai2_1: Day la mang ko doi xung");
        }
        System.out.println(" ");
        System.out.println("- Bai2_2: ");
        Bai2_2(n);
        System.out.println(" ");
        String binary = Bai2_3(n);
        System.out.println("- Bai2_3: " + binary);
    }

    static boolean Bai2_1(int n) {
        String s = Integer.toString(n);
        int j = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }

    public static void Bai2_2(int n) {
        String numberString = String.valueOf(n);
        for (int i = 0; i < numberString.length(); i++) {
            System.out.println(numberString.charAt(i));
        }
    }

    public static String Bai2_3(int n) {
        Stack<Integer> stack = new Stack<>();
        while (n != 0) {
            int remainder = n % 2;
            stack.push(remainder);
            n = n / 2;
        }
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }
        return binary.toString();
    }
}
