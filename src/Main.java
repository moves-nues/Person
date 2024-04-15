import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int value = 33;
        System.out.println(value);
        changeValue(value);
        System.out.println(value);

        Integer value2 = 33;
        System.out.println(value2);
        changeValue(value2);
        System.out.println(value2);

        Integer[] value3 = new Integer[] {3,4};
        System.out.println(Arrays.toString(value3));
        changeValue(value3);
        System.out.println(Arrays.toString(value3));

        Integer[] value4 = new Integer[] {3,4};
        System.out.println(Arrays.toString(value4));
        changeValue1(value4);
        System.out.println(Arrays.toString(value4));

        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println(person);
        changeValue(person);
        System.out.println(person);

        Person person1 = new Person("Lyapis", "Trubetskoy");
        System.out.println(person1);
        changeValue(person1);
        System.out.println(person1);



    }
    public static void changeValue(int value) {
        value = 22;
    }

    public static void changeValue(Integer value2) {
        value2 = 22;
    }

    public static void changeValue(Integer[] value) {
        System.out.println(Arrays.toString(value));
        value = new Integer[]{1, 2};
        System.out.println(Arrays.toString(value));

    }
    public static void changeValue1(Integer[] value) {
        System.out.println(Arrays.toString(value));
        value[0] = 99;
        System.out.println(Arrays.toString(value));

    }

    public static void changeValue(Person person) {
        System.out.println(person);
        person = new Person("Ilya", "Laqutenco");
        System.out.println(person);

    }
    public static void changeValue1(Person person) {
        System.out.println(person);
        person.setSurname("Lagutenco");
        person.setName("Ilya");
        System.out.println(person);
    }
}