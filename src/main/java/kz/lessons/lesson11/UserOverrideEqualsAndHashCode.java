package kz.lessons.lesson11;

/**
 * Класс User с переопределением
 * Equals и HashSet
 */
public class UserOverrideEqualsAndHashCode extends User {
    public UserOverrideEqualsAndHashCode(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof UserOverrideEqualsAndHashCode)) return false;
        UserOverrideEqualsAndHashCode entry = (UserOverrideEqualsAndHashCode) obj;
        return name.equals(entry.name) && age == entry.age;
    }

    @Override
    public int hashCode() {
        int hash = 37;
        hash = hash * 17 + name.hashCode();
        hash = hash * 17 + age;
        return hash;
    }

}
