package Algorithms;
/*
 1.Assume first element to be sorted
 2.Set second element as key, compare with element before it and sort
 3. repeat for array
*/

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int arr[]={3,-1,5,0,23,7};
        int key=0;
        int placeholder=0;
        for (int j=0;j<arr.length;j++) {

            for (int i = 0; i < arr.length - 1; i++) {
                key = arr[i + 1];
                if (key < arr[i]) {
                    placeholder = arr[i];
                    arr[i] = key;
                    arr[i + 1] = placeholder;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
