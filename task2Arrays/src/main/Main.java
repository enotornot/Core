package main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{5,6,3,2,5,1,4,9};
        System.out.println("Массив до сортировки : " + Arrays.toString(array));
        System.out.println("Отсортированный массив : " + Arrays.toString(sortArrays(array)));
    }

    public static int[] sortArrays(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                    isSorted = false;
                }
            }
        }
        return array;
    }
}