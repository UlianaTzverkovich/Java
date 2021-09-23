import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NinthLesson {

    public static void main(String[] args) {
        Integer[][] testArray = {{7, 7, 3}, {7, 7, 1}, {777, 1, 0}};

        System.out.println(firstTask(testArray));
        System.out.println(secondTask(testArray));
        System.out.println(thirdTask(testArray));
        Arrays.stream(fourthTask(7, 7)).map(Arrays::toString).forEach(System.out::println);
        System.out.println(fifthTask(new int[]{7, 7, 3}, new int[]{7, 7, 1}));
    }


    public static Integer firstTask(Integer[][] array) {
        if (array == null)
            throw new NullPointerException();

        Integer maxValue = null;
        for (Integer[] subArray : array) {
            for (Integer item : subArray) {
                if (maxValue == null) {
                    maxValue = item;
                    continue;
                }

                if (item.compareTo(maxValue) > 0)
                    maxValue = item;
            }
        }

        return maxValue;
    }


    public static boolean secondTask(Integer[][] array) {
        if (array == null)
            throw new NullPointerException();

        for (Integer[] subArray : array) {
            if (subArray.length != array.length)
                return false;
        }

        return true;
    }


    public static Integer thirdTask(Integer[][] array) {
        if (array == null)
            throw new NullPointerException();

        int sum = 0;
        Integer line = null;
        for (int i = 0; i < array.length; i++) {
            int subSum = 0;
            for (Integer item : array[i]) {
                subSum += item;
            }

            if (subSum > sum) {
                line = i;
                sum = subSum;
            }
        }

        return line;
    }

    public static char[][] fourthTask(int m, int n) {
        if (m <= 0 || n <= 0)
            throw new Error("Числа должны быть больше \"0\"");

        Random random = new Random();
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char[][] array = new char[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = alfabet.charAt(random.nextInt(alfabet.length()));
        }

        return array;
    }


    public static int fifthTask(int[] numbers, int[] weight) {
        if (numbers.length != weight.length)
            throw new Error("У входных массивов должны одинаковая длина");

        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        while (true) {
            int i = random.nextInt(numbers.length);
            set.add(i);
            for (int item : weight) {
                if (numbers[i] == item)
                    return numbers[i];
            }

            if (set.size() == numbers.length)
                throw new Error("В массивах разные числа");
        }
    }
}
