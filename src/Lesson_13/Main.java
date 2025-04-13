package Lesson_13;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Демонстрация работы класса Student (Задание 1)
        Set<Student> students = new HashSet<>();
        students.add(new Student("Иван", "Группа 1", 1, Arrays.asList(4, 5, 3)));
        students.add(new Student("Мария", "Группа 2", 2, Arrays.asList(2, 3, 2)));
        students.add(new Student("Алексей", "Группа 3", 1, Arrays.asList(5, 5, 5)));

        System.out.println("Исходный список студентов:");
        Student.printStudents(students, 1);
        Student.printStudents(students, 2);

        Student.removeUnderperformingStudents(students);
        Student.promoteEligibleStudents(students);

        System.out.println("\nПосле удаления неуспевающих и перевода:");
        Student.printStudents(students, 1);
        Student.printStudents(students, 2);

        // Демонстрация работы класса PhoneDirectory (Задание 2)
        PhoneDirectory phoneBook = new PhoneDirectory();
        phoneBook.add("Иванов", "123-456");
        phoneBook.add("Петров", "789-012");
        phoneBook.add("Иванов", "555-555");

        System.out.println("\nТелефоны Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Сидорова: " + phoneBook.get("Сидоров"));
    }
}