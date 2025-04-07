package Lesson_12.exceptions;

// Исключение для обработки ошибок размера массива
public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Введен неверный размер массива!");
    }
}