package lesson6;

public class AnimalApp {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Тузик", 314, 7);
        Dog dog2 = new Dog("Шарик", 447, 15);
        Cat[] cat = new Cat[3];

        System.out.println("Коты:");
        cat[0] = new Cat("Барсик");
        cat[1] = new Cat("Мурзик");
        cat[2] = new Cat("Рыжик");

        for (Cat cats : cat) {
            cats.run();
        }

        for (Cat cats : cat) {
            if (!cats.swim()) {
                break;
            }
        }

        System.out.println();
        System.out.println("Собаки:");
        dog1.info();
        dog2.info();

        System.out.println();
        System.out.println("Cоздано:");
        System.out.println("Котов: " + Cat.getCount() + ",");
        System.out.println("Собак: " + Dog.getCount() + ",");
        System.out.println("Всего животных: " + Animal.getCount() + ".");


    }
}
