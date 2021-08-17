package lesson5;

public class CatsApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsic", "grey", 5);
        cat.info();
        Cat cat2 = new Cat("Vaska", "black", 2);
        cat2.info();
        System.out.println(cat.getName());
        Cat cat3 = new Cat("тёмно-серый", 5);
        cat3.info();
        System.out.println(cat2.getName());
        Cat cat4 = new Cat("Рыжий");
        cat4.info();
//        cat.name = "111";
//        System.out.println(cat.name);
        cat3.setName("Murzik");
        cat3.info();

    }
}
