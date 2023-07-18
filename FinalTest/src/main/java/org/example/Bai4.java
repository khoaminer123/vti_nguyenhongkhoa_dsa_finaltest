package org.example;

import java.util.*;

public class Bai4 {
    public static void main(String[] args) {
        int A[] = {100, 2130, 123, 3, 54, 6, 1, 2111, 1, 1, 1, 1, 1, 1, 45, 5, 465, 46, 1234, 54353};

        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                evenNumbers.add(A[i]);
            }
        }
        Collections.sort(evenNumbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        int evenIndex = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                A[i] = evenNumbers.get(evenIndex++);
            }
        }
        System.out.println(Arrays.toString(A));
    }
}
