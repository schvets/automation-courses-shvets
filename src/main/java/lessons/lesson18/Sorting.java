package lessons.lesson18;

import java.util.Arrays;

public class Sorting {
    static int[] array = {442, 515, 617, 842, 862, 293, 276, 261, 545, 664, 150, 612, 60, 561, 792, 396, 42, 451, 86, 47};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(array));
        bubbleSort();
//        selectionSort();
//        quickSort(array, 0, array.length - 1);
//        mergeSort();

//        System.out.println(binarySearch(47));
        System.out.println(binarySearch(792, 0, array.length - 1));
        System.out.println(Arrays.toString(array));

    }

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    private static void mergeSort() {

    }

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

    private static void quickSort(int[] array, int start, int stop) {
        if (start < stop) {
            int divideIndex = partition(array, start, stop);
            quickSort(array, start, divideIndex - 1);
            quickSort(array, divideIndex, stop);
        }
    }

    private static int partition(int[] array, int start, int stop) {
        int rightIndex = stop;
        int leftIndex = start;

        int pivot = array[start];
        while (leftIndex <= rightIndex) {
            while (array[leftIndex] < pivot) {
                leftIndex++;
            }

            while (array[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                int temp = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }


    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    private static void selectionSort() {
        for (int a = 0; a < array.length; a++) {
            int index = minSelection(array, a);
            int temp = array[a];
            array[a] = array[index];
            array[index] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    private static int minSelection(int[] arr, int start) {
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minIndex = i;
                minValue = array[i];
            }
        }
        return minIndex;
    }

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    private static void bubbleSort() {
        System.out.println("bubble sort");
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int a = 1; a < array.length; a++) {
                if (array[a - 1] > array[a]) {
                    int temp = array[a];
                    array[a] = array[a - 1];
                    array[a - 1] = temp;
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

    private static int binarySearch(int num) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (num < array[middle]) {
                high = middle - 1;
            } else if (num > array[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    private static int binarySearch(int num, int low, int high) {
        int result = -1;
        int middle = low + (high - low) / 2;
        if (num < array[middle]) {
            return binarySearch(num, low, middle - 1);
        } else if (num > array[middle]) {
            return binarySearch(num, middle + 1, high);
        } else {
            return middle;
        }
    }

}
