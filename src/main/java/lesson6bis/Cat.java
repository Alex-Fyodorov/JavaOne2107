package lesson6bis;

import java.util.Random;

public class Cat extends Animal {
    private String name;
    private static final int maxRunDistance = 200;
    private static final int maxSwimDistance = 0;
    private static int count;
    Random random = new Random();

    public Cat(String name) {
        this.name = name;
        count++;
    }

    /**
     * Метод, выводящий длину пробега у котов.
     */
    public void run (){
        System.out.println(this.name + " пробежал " +
                (1 + random.nextInt(maxRunDistance)) + " метров.");
    }

    /**
     * Выводит, дистанцию заплыва у котов.
     * Если коты плавать не умеют, то так и пишет.
     *
     * @return false, если коты не умеют плавать
     */
    public boolean swim (){
        if (maxSwimDistance == 0){
            System.out.println("Коты не умеют плавать.");
            return false;
        } else {
            System.out.println(this.name + " проплыл " +
                    (1 + random.nextInt(maxSwimDistance)) + " метров.");
            return true;
        }
    }

    public static int getCount() {
        return count;
    }
}
