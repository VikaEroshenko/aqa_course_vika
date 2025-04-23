package Lesson_13;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Демонстрация работы Decanat (Задание 1)
        Decanat decanat = new Decanat();
        decanat.addStudent(new Student("Иван", "Группа 1", 1, Arrays.asList(4, 5, 3)));
        decanat.addStudent(new Student("Мария", "Группа 2", 2, Arrays.asList(2, 3, 2)));
        decanat.addStudent(new Student("Алексей", "Группа 3", 1, Arrays.asList(5, 5, 5)));

        System.out.println("Исходный список студентов:");
        decanat.printStudentsByCourse(1);
        decanat.printStudentsByCourse(2);

        decanat.removeUnderperformingStudents();
        decanat.promoteEligibleStudents();

        System.out.println("\nПосле удаления неуспевающих и перевода:");
        decanat.printStudentsByCourse(1);
        decanat.printStudentsByCourse(2);

        // Демонстрация работы класса PhoneDirectory (Задание 2)
        PhoneDirectory phoneBook = new PhoneDirectory();
        phoneBook.add("Иванов", "123-456");
        phoneBook.add("Петров", "789-012");
        phoneBook.add("Иванов", "555-555");

        // Попытка добавить существующий номер - вызовет исключение
        try {
            phoneBook.add("Сидоров", "123-456");
        } catch (IllegalArgumentException e) {
            System.out.println("\nОшибка: " + e.getMessage());
        }

        System.out.println("\nТелефоны Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Сидорова: " + phoneBook.get("Сидоров"));
    }
}