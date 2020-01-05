package sort_Algorithm.insertion_Sort.shell_Sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 9, 5, 7, 3, 6, 4, 8, 2, 5};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] arr) {

        int j = 0;
        int temp; // 初始化两个值
        // j时为了第二层循环，temp为了存储当前值，与其他两种插入排序不同的时，本处使用temp，上面两处使用数组的第0个位置存储
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {// 本次循环的是增量的值 5 2 1
            System.out.println("本次循环增量为" + gap);
            for (int i = gap; i < arr.length; i++) {// 记录每次的变化，i=gap
                // 相当于第一遍先拿a[5]也就是13 来进行
                temp = arr[i]; // temp存储当前的值，与其他两种插入排序不同的时，本处使用temp，上面两处使用数组的第0个位置存储

                for (j = i - gap; j >= 0; j -= gap) { // 本处循环是最重要的循环，也就是移动位置的循环
                    // j=i-gap，第一遍j就等于0
                    // 也就是a【0】=26
                    if (temp < arr[j]) { // temp = a[5] = 13
                        // ，temp肯定是小于13的，所以执行下边语句
                        arr[j + gap] = arr[j]; // 将a[j] = 26 放到 j+gap的位置，也就是 0+5
                        // a[5]的位置
                    } else { // 否则跳过本层循环，记录执行 i=gap的循环
                        break;
                    }
                }

                arr[j + gap] = temp; // 最后把temp的值还原
            }
        }
    }
}
