/*
 Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов
не равны, необходимо как-то оповестить пользователя.

* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws Exception {
        // методы вызывающие исключения
        // metod1();
        // metod2();
        //metod3();

        int [] ar1 = new int[] {10, 12, 14, 45, 5};
        int [] ar2 = new int[] {12, 8, 5, 45};
        int[] ar3 = differenceArray(ar1, ar2);

        for (int i = 0; i < ar3.length; i++){
            System.out.print(ar3[i] + ", ");
        }
    }

    public static void metod1(){
        int a = 10;
        int b = 0;
        int c = a / b;
    }

    public static void metod2(){
        int[] nums = new int[] { 1, 2, 3, 5 };
        int rez = nums[0] + nums[4];

    }

    public static void metod3() throws FileNotFoundException {
        File file = new File("Path");
        FileInputStream f = new FileInputStream(file);
    }

    public static int[] differenceArray(int[] a, int[] b){
        if (a.length != b.length){
            throw new UnsupportedOperationException("Разное количество элементов в массива, операция не возможна!");
        }
        int[] rez = new int[a.length];
        for (int i = 0; i < a.length; i++){
            rez[i] = a[i] - b[i];
        }
        return rez;
    }

}