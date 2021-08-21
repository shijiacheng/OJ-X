package com.shijc.coding;

/**
 * Created by shijiacheng on 2018/2/28.
 */
public class SortUtils {

    /**
     * 冒泡排序
     *
     * @param array
     */
    public void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 选择排序
     *
     * @param array
     */
    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int k = i;
            for (int j = k + 1; j < array.length; j++) {

                if (array[j] < array[k]) {
                    k = j;
                }
            }

            if (i != k) {
                int temp = array[i];
                array[i] = array[k];
                array[k] = temp;
            }
        }
    }


    /**
     * 快速排序
     *
     * @param array
     * @param low
     * @param high
     */
    public void quickSort(int[] array, int low, int high) {
        if (low > high) {
            return;
        }

        int i = low;
        int j = high;
        int key = array[low];

        while (i < j) {
            while (key <= array[j] && i < j) {
                j--;
            }
            while (key >= array[i] && i < j) {
                i++;
            }

            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        array[low] = array[i];
        array[i] = key;
        quickSort(array, low, j - 1);
        quickSort(array, j + 1, high);

    }

    /**
     * 归并排序
     * @param array
     */
    public void mergeSort(int[] array) {
        int[] temp = new int[array.length];
        mergeSort(array, 0, array.length - 1, temp);

    }

    private void mergeSort(int[] array, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid, temp);
            mergeSort(array, mid + 1, right, temp);
            merge(array, left, mid, right, temp);

        }
    }


    private void merge(int[] array, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[t++] = array[i++];
            } else {
                temp[t++] = array[j++];
            }
        }
        while (i <= mid) {
            temp[t++] = array[i++];
        }
        while (j <= right) {
            temp[t++] = array[j++];
        }

        t = 0;
        while (left <= right) {
            array[left++] = temp[t++];
        }
    }

}
