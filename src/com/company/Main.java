package com.company;

public class Main {

    public static int recBinSearch(int[] arr, int what, int leftIndex, int rightIndex) {
        if (rightIndex < leftIndex)
            return -1;
        int midIndex = (leftIndex + rightIndex) / 2;
        if (what == arr[midIndex]) {
            return midIndex;
        } else if (what < arr[midIndex]) {
            return recBinSearch(arr, what, leftIndex, midIndex - 1);
        } else {
            return recBinSearch(arr, what, midIndex + 1, rightIndex);
        }
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,8};
        System.out.println(recBinSearch(a,8,0,a.length-1));
    }
}
