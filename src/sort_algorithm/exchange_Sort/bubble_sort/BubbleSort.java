package sort_algorithm.exchange_sort.bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = new int[]{9, 5, 1, 3, 7, 8, 4, 6, 2};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        //共比较多少轮
        for (int i = 0; i < arr.length - 1; i++) {
            //每一轮进行的比较
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
