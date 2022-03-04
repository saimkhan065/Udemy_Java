package Algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 17, 99, 0};
        int min;
        int min_pos=0;
        int copy;
        for (int j = 0; j < arr.length-1; j++) {
            min = arr[j];
            for (int i = j; i < arr.length - 1; i++) {
                if (min > arr[i + 1]) {
                    min = arr[i + 1];
                    min_pos = i+1;
                }


            } //tag minimum value in the array
            copy = arr[j];
            arr[j]=arr[min_pos];
            arr[min_pos] = copy;

        } //swap values without over-writing
        System.out.println(Arrays.toString(arr));
    }
}
