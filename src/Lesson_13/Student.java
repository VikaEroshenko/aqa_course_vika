package Lesson_13;
import java.util.*;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageGrade() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public void promoteToNextCourse() {
        if (getAverageGrade() >= 3) {
            course++;
        }
    }

    // Метод для удаления студентов со средним баллом < 3
    public static void removeUnderperformingStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3);
    }

    // Метод для перевода студентов на следующий курс (если средний балл >= 3)
    public static void promoteEligibleStudents(Set<Student> students) {
        for (Student student : students) {
            student.promoteToNextCourse();
        }
    }

    // Метод для вывода студентов заданного курса
    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты " + course + " курса:");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}