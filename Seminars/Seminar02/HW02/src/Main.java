// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя
// ввод данных.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        inPut();
    }

    public static void inPut(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        try{
            float fNumber = Float.parseFloat(reader.readLine().replace(",", "."));
            System.out.printf("Вы ввели число %f\n", fNumber);
        } catch (IOException | NumberFormatException e) {
            inPut();
        }
    }
}