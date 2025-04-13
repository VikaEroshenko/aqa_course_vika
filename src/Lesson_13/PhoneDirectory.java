package Lesson_13;
import java.util.*;

public class PhoneDirectory {
    private Map<String, List<String>> directory;

    public PhoneDirectory() {
        directory = new HashMap<>();
    }

    // Добавление записи (фамилия + номер)
    public void add(String surname, String phoneNumber) {
        directory.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }

    // Получение всех номеров по фамилии
    public List<String> get(String surname) {
        return directory.getOrDefault(surname, Collections.emptyList());
    }
}