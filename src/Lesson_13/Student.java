package Lesson_13;
import java.util.*;

public class Student {
    private final String name;
    private final String group;
    private int course;
    private final List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new ArrayList<>(grades);
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageGrade() {
        return grades.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    public void promoteToNextCourse() {
        course++;
    }

    public void showInfo() {
        System.out.printf("%s %s (курс: %d, средний балл: %.1f)%n",
                name, group, course, getAverageGrade());
    }
}