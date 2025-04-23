package Lesson_13;
import java.util.*;

public class PhoneDirectory {
    private final Map<String, Set<String>> surnameToNumbers = new HashMap<>();
    private final Set<String> allPhoneNumbers = new HashSet<>();

    public void add(String surname, String phoneNumber) {
        if (allPhoneNumbers.contains(phoneNumber)) {
            throw new IllegalArgumentException("Номер " + phoneNumber + " уже существует в справочнике");
        }

        surnameToNumbers.computeIfAbsent(surname, k -> new HashSet<>()).add(phoneNumber);
        allPhoneNumbers.add(phoneNumber);
    }

    public Set<String> get(String surname) {
        return surnameToNumbers.getOrDefault(surname, Collections.emptySet());
    }
}