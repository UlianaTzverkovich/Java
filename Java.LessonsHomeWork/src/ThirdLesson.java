import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ThirdLesson {
    public static void main(String[] args) throws IOException {
        System.out.println("Task 1");
        int[] arr = {1, 2, 3};
        int[] arr2 = {3, 2, 1};
        whatToSay(arr);
        whatToSay(arr2);

        System.out.println("Task 2");
        arrayCreater();


        System.out.println("Task 3");
        int[] arr3 = {5, 6, 7, 2};
        switchElements(arr3);


        System.out.println("Task 4");
        int[] arr4 ={1, 2, 3, 1, 2, 4};
        System.out.println(Uniq(arr4));



        System.out.println("Task 5");
        System.out.println(FibonacciNum(10));



        System.out.println("Task 6");
        int[] nums = arrayCreater();
        int[] sorted = mergeSort(nums);
        System.out.println(Arrays.toString(sorted));


    }
    public static void whatToSay (int[] array)
        {
        boolean F = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                F = false;
                break;
            }
        }
        if(F)
            System.out.println("OK");
        else System.out.println("Please, try another numbers");
    }

    public static int[] arrayCreater() {
        Scanner in = new Scanner(System.in);
        System.out.print("Array length: ");
        int length = in.nextInt();
        if (length < 0)
            return new int[0];

        int[] n = new int[length];
        System.out.println("Numbers of array:");
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(n));
        return n;
    }

    public static void switchElements(int[] array){
        System.out.println(Arrays.toString(array));
        int a = array[0];
        int b = array[array.length - 1];

        array[0] = b;
        array[array.length - 1] = a;
        System.out.println(Arrays.toString(array));
    }
    public static Integer Uniq(int[] array){
        System.out.println(Arrays.toString(array));
        for (int i : array) {
            int count = 0;
            for (int n : array) {
                if(n == i)
                    count++;
                }
                if (count == 1) return i;
        }
        return null;
    }

    public static long FibonacciNum(int n) {
         {
            int fst = 0, sec = 1, tmp;
            for (int i = 0; i < n; i++) {
                tmp = fst + sec;
                fst = sec;
                sec = tmp;
            }
            return fst;
        }
    }

    public static int[] mergeSort(int[] array) throws IOException {
        System.out.println(Arrays.toString(array));
        if(array.length < 2){
            return array;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right;
        if(array.length % 2 == 0)
            right = new int[mid];
        else right = new int[mid + 1];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = array[mid + j];
        }
        int[] result = new int[array.length];
        left = mergeSort(left);
        right = mergeSort(right);
        result = mergeParts(left, right);
        return result;
    }

    private static int[] mergeParts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;
        while (leftPointer < left.length || rightPointer < right.length){
            if(leftPointer < left.length && rightPointer < right.length){
                if(left[leftPointer] < right[rightPointer])
                    result[resultPointer++] = left[leftPointer++];
                else result[resultPointer++] = right[rightPointer++];
            }
            else if(leftPointer < left.length)
                result[resultPointer++] = left[leftPointer++];
            else  if(rightPointer < right.length)
                result[resultPointer++] = right[rightPointer++];
        }
        return result;
    }

    }



