package kz.lessons.lesson11;

/**
 * Класс User с переопределением
 * Equals
 */
public class UserOverrideEquals extends User {
    public UserOverrideEquals(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof UserOverrideEquals)) return false;
        UserOverrideEquals entry = (UserOverrideEquals) obj;
        return name.equals(entry.name) && age == entry.age;
    }
}
