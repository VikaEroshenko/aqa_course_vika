package Lesson_12;

import Lesson_12.exceptions.MyArraySizeException;
import Lesson_12.exceptions.MyArrayDataException;

public class MyArray {
    private static final int REQUIRED_SIZE = 4;

    // Метод для инициализации и обработки массива
    public int initialisationArray(String[][] array) throws MyArraySizeException, MyArrayDataException {

        // Проверяем количество строк
        if (array.length != REQUIRED_SIZE) {
            throw new MyArraySizeException();
        }

        // Проверяем количество столбцов
        for (String[] row : array) {
            if (row.length != REQUIRED_SIZE) {
                throw new MyArraySizeException();
            }
        }

        int sum = 0;

        // Сумма элементов массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }

        return sum;
    }

    // Метод для генерации и поимки ArrayIndexOutOfBoundsException
    public void demonstrateIndexOutOfBound() {
        int[] arr = new int[3];
        System.out.println("Пытаемся получить элемент с индексом 5 в массиве размером 3.");
        int value = arr[5];
    }
}