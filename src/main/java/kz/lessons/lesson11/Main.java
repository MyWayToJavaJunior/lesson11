package kz.lessons.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Основной класс
 */
public class Main {

    public static void main(String[] args) {
        User[] users = {new User("Pan", 41), new User("Pan", 41),
                new User("Alf", 12), new User("Ion", 64), new User("Iov", 46),
                new User("Alf", 12), new User("Alf", 35), new User("Iov", 41),
                new User("Ion", 64), new User("Yan", 12)};
        ArrayList<User> usersAL = new ArrayList<>(Arrays.asList(users));
        HashSet<User> usersHS = new HashSet<>(Arrays.asList(users));
        HashMap<Integer, String> usersHM = new HashMap<>();
        for (int i = 0; i < users.length; i++) {
            usersHM.put(users[i].getAge(), users[i].getName());
        }
        System.out.println("-------------------------- INITIAL -----------------------------");
        System.out.println("1  " + users.getClass().getSimpleName() + "    : " + Arrays.asList(users).toString());
        System.out.println("-------------- Equals & HashCode not overrided -----------------");
        System.out.println("2  " + usersAL.getClass().getSimpleName() + " : " + usersAL.toString());
        System.out.println("3  " + usersHS.getClass().getSimpleName() + "   : " + usersHS.toString());
        System.out.println("4  " + usersHM.getClass().getSimpleName() + "   : " + usersHM.toString());

        // equals block
        UserOverrideEquals[] usersEquals = new UserOverrideEquals[users.length];
        for (int i = 0; i < users.length; i++) {
            usersEquals[i] = new UserOverrideEquals(users[i].getName(), users[i].getAge());
        }
        ArrayList<User> usersALEquals = new ArrayList<User>(Arrays.asList(usersEquals));
        HashSet<User> usersHSEquals = new HashSet<User>(Arrays.asList(usersEquals));
        HashMap<Integer, String> usersHMEquals = new HashMap<>();
        for (int i = 0; i < usersEquals.length; i++) {
            usersHMEquals.put(usersEquals[i].getAge(), usersEquals[i].getName());
        }
        System.out.println("--------------- Only equals overrided ---------------------------");
        System.out.println("5  " + usersALEquals.getClass().getSimpleName() + " : " + usersALEquals.toString());
        System.out.println("6  " + usersHSEquals.getClass().getSimpleName() + "   : " + usersHSEquals.toString());
        System.out.println("7  " + usersHMEquals.getClass().getSimpleName() + "   : " + usersHMEquals.toString());

        // HashCode block
        UserOverrideHashCode[] usersHashCode = new UserOverrideHashCode[users.length];
        for (int i = 0; i < users.length; i++) {
            usersHashCode[i] = new UserOverrideHashCode(users[i].getName(), users[i].getAge());
        }
        ArrayList<User> usersALHashCode = new ArrayList<User>(Arrays.asList(usersHashCode));
        HashSet<User> usersHSHashCode = new HashSet<User>(Arrays.asList(usersHashCode));
        HashMap<Integer, String> usersHMHashCode = new HashMap<>();
        for (int i = 0; i < usersHashCode.length; i++) {
            usersHMHashCode.put(usersHashCode[i].getAge(), usersHashCode[i].getName());
        }
        System.out.println("--------------- Only HashCode overrided --------------------------");
        System.out.println("8  " + usersALHashCode.getClass().getSimpleName() + " : " + usersALHashCode.toString());
        System.out.println("9  " + usersHSHashCode.getClass().getSimpleName() + "   : " + usersHSHashCode.toString());
        System.out.println("10 " + usersHMHashCode.getClass().getSimpleName() + "   : " + usersHMHashCode.toString());

        // equals and HashCode block
        UserOverrideEqualsAndHashCode[] usersEqualsAndHashCode = new UserOverrideEqualsAndHashCode[users.length];
        for (int i = 0; i < users.length; i++) {
            usersEqualsAndHashCode[i] = new UserOverrideEqualsAndHashCode(users[i].getName(), users[i].getAge());
        }
        ArrayList<User> usersALEqualsAndHashCode = new ArrayList<User>(Arrays.asList(usersEqualsAndHashCode));
        HashSet<User> usersHSEqualsAndHashCode = new HashSet<User>(Arrays.asList(usersEqualsAndHashCode));
        HashMap<Integer, String> usersHMEqualsAndHashCode = new HashMap<>();
        for (int i = 0; i < usersEqualsAndHashCode.length; i++) {
            usersHMEqualsAndHashCode.put(usersEqualsAndHashCode[i].getAge(), usersEqualsAndHashCode[i].getName());
        }
        System.out.println("--------------- Equals & HashCode overrided -------------------------");
        System.out.println("11 " + usersALEqualsAndHashCode.getClass().getSimpleName() + " : " + usersALEqualsAndHashCode.toString());
        System.out.println("12 " + usersHSEqualsAndHashCode.getClass().getSimpleName() + "   : " + usersHSEqualsAndHashCode.toString());
        System.out.println("13 " + usersHMEqualsAndHashCode.getClass().getSimpleName() + "   : " + usersHMEqualsAndHashCode.toString());
    }

}
