package Algorithms;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {5,-10,49,55,-21};
        for (int j=0;j<arr.length-1;j++)
        {
            for (int i=0;i< arr.length-1;i++)
            {
                if (arr[i]>arr[i+1])
                {
                    int temp;
                    temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;

                }


            }

        }

        System.out.println("Sorted List: "+ Arrays.toString(arr));

    }
}
