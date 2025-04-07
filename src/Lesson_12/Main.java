package Lesson_12;

import Lesson_12.exceptions.MyArraySizeException;
import Lesson_12.exceptions.MyArrayDataException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArray arrayProcessor = new MyArray();

        String[][] arrays = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "-", "0", "16"}
        };

        System.out.println("Переданный массив:");
        for (String[] row : arrays) {
            System.out.println(Arrays.toString(row));
        }

        try {
            int sum = arrayProcessor.initialisationArray(arrays);
            System.out.println("\nСумма чисел массива: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("\nВведен неверный размер массива!");
        } catch (MyArrayDataException e) {
            System.out.println("\nОшибка: " + e.getMessage());
        }

        System.out.println("\nДемонстрация ArrayIndexOutOfBoundsException:");
        try {
            arrayProcessor.demonstrateIndexOutOfBound();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: Индекс выходит за пределы массива!");
            System.out.println("Сообщение исключения: " + e.getMessage());
        }
    }
}