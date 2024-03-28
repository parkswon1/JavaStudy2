package com.JumToSpring;

import java.util.Arrays;

public class bubbleSort {
    static void bubbleSort(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j= 1 ; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        bubbleSort(new int[]{3, 2, 4, 1});
    }
}
