
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SecondLesson {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
//        Show(1);
//        Task_1();

//        Show(2);
//        Task_2();

//        Show(3);
//        System.out.println("Результат: " + Task_3());

//        Show(4);
//        System.out.println("Результат: " + Task_4());

        Show(5);
        int[] array5 = {3, -3, 7, 4, 5, 4, 3};
        System.out.println("array = " + Arrays.toString(array5));
        System.out.println(Task_5(array5));

        Show(6);
        int[] array6 = {3, -3, 7, 4, 5, 4, 3};
        System.out.println(Task_6(array6));

    }
    public  static  void Task_1(){
        for (int i = 1; i <= 99 ; i++) {
            if(i % 2 != 0)
                System.out.println(i);
        }
    }
    public static void Task_2(){
        List<Integer> int3 = new ArrayList<>();
        List<Integer> int5 = new ArrayList<>();
        List<Integer> int35 = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0) {
                int3.add(i);
            }
            if(i % 5 == 0) {
                int5.add(i);
            }
            if(i % 3 == 0 && i % 5 == 0) {
                int35.add(i);
            }

        }
        System.out.println("Делится на 3: " + int3);
        System.out.println("Делится на 5: " + int5);
        System.out.println("Делится на 3 и на 5: " + int35);
    }

    public static boolean Task_3() throws IOException{

        Scanner in = new Scanner(System.in);


        System.out.print("Введите первое число: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Введите второе число: ");
        int b = Integer.parseInt(reader.readLine());
        System.out.print("Введите третье число: ");
        int c = Integer.parseInt(reader.readLine());

        return b > a && c > b;
    }
    public static boolean Task_4() throws IOException {

        System.out.println("Введите первое число: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число: ");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Введите третье число: ");
        int c = Integer.parseInt(reader.readLine());

        return (a + b) == c;
    }

    public static boolean Task_5(int[] array){
        if(array.length >= 2) {
            return array[0] == 3 && array[array.length - 1] == 3;
        }
        return false;
    }
    public static boolean Task_6(int[] array){
        for(int i : array){
            if(i == 1 || i == 3){
                return true;
            }
        }
        return false;
    }
    public static void Show(int x){
        System.out.println("Task " + x);
    }
}
