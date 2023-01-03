package com.imagegrafia.miscellaneous;

public class SortArraySample {
    public static void main(String[] args) {
        int arr[] = {11, 5, 4, 9, 3, 2};
        for (int i : sortArray(arr)) {
            System.out.print(i + "\t ,");
        }
        System.out.println("Max in array" + findMaxinArray(arr));
        System.out.println("Max by swappping in array" + findMaxinArrayUsingSwaping(arr));
        System.out.println("Min in array" + findMinInArray(arr));
    }

    static int findMaxinArray(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findMaxinArrayUsingSwaping(int arr[]) {
//        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
            }
        }
        return arr[arr.length - 1];
    }

    static int findMinInArray(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    static int[] sortArray(int arr[]) {
//        for (int j = 0; j < arr.length; j++) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                //swap position
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
            }
//            }
        }
        return arr;
    }
}
