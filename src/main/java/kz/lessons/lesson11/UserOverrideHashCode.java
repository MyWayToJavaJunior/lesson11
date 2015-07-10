package kz.lessons.lesson11;

/**
 * Класс User с переопределением
 * HashSet
 */
public class UserOverrideHashCode extends User {
    public UserOverrideHashCode(String name, int age) {
        super(name, age);
    }

    @Override
    public int hashCode() {
        int hash = 37;
        hash = hash * 17 + name.hashCode();
        hash = hash * 17 + age;
        return hash;
    }
}
