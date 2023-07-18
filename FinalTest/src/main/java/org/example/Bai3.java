package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai3 {
    public static void main(String[] args) {
        int A[]={1,23,4,5,6,78,8,2,32,2,32,432,32,234,432,1,432,324};
        int[] result = Bai3_1(A);
        System.out.println("- Bai3_1:");
        System.out.println("Mảng sau khi đảo ngược: " + Arrays.toString(result));
        System.out.println(" ");

        System.out.println("- Bai3_2: ");
        int left = 0;
        int right = A.length - 1;
        while(left<right){
            while(A[left]%2!=0){
                left ++;
            }
            while (A[right]%2==0){
                right --;
            }
            int temp = A[left];
            A[left] = A[right];
            A[right]= temp;
            left ++;
            right --;
        }
        for(int x = 0;x< A.length;x++)
        {
            System.out.print(A[x]+ "  ");
        }
        System.out.println("");
        System.out.println(" ");
        System.out.println("- Bai3_3: ");
        List<Integer> primePositions = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (checkSNT(A[i])) {
                primePositions.add(i);
            }
        }
        System.out.println("Các vị trí của số nguyên tố trong mảng A là: " + primePositions);
    }

    public static int[] Bai3_1(int[] arr) {
        // Đảo ngược mảng
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    static boolean checkSNT(int a){
        if(a<2){
            return false;
        int count = 0;
        for(int i = 1;i<=a;i ++){
            if(a%i ==0){
                count ++;
            }
        }
        if(count ==2 ){
            return true;
        }
        return false;
    }
}
