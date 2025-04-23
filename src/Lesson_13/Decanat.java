package Lesson_13;

import java.util.*;

public class Decanat {
    private Set<Student> students = new HashSet<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeUnderperformingStudents() {
        students.removeIf(student -> student.getAverageGrade() < 3);
    }

    public void promoteEligibleStudents() {
        students.forEach(student -> {
            if (student.getAverageGrade() >= 3) {
                student.promoteToNextCourse();
            }
        });
    }

    public void printStudentsByCourse(int course) {
        System.out.println("Студенты " + course + " курса:");
        students.stream()
                .filter(student -> student.getCourse() == course)
                .forEach(Student::showInfo);
    }
}