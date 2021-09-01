package lesson6;

public class Dog extends Animal {
    private String name;
    private int runDistance;
    private int swimDistance;
    private static final int maxRunDistance = 500;
    private static final int maxSwimDistance = 10;
    private static int count;

    /**
     * Конструктор для собаки. проверяет входящие данные для
     * бега и плавания и, если они больше допустимых, уменьшает их
     * до максимальных. Также метод считает, сколько было создано собак.
     * Использовать функцию Math.min подсказала сама IDEA.
     *
     * @param name         имя
     * @param runDistance  дистанция бега
     * @param swimDistance дистанция заплыва
     */
    public Dog(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = Math.min(runDistance, maxRunDistance);
        this.swimDistance = Math.min(swimDistance, maxSwimDistance);
        count++;
    }

    /**
     * Вывод счётчика собак. Также можно было бы добавить
     * геттеры и сеттеры для изменения параметров объектов.
     * Для выполнения ДЗ они в принципе не нужны, но ведь
     * ты учишь нас смотреть на программирование шире. :)
     * Подумав, не стал добавлять, так как при необходимости
     * вводятся эти методы достаточно просто и не требуют
     * какой-либо правки кода.
     */
    public static int getCount() {
        return count;
    }

    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return name +
                " пробежал " + runDistance +
                "м и проплыл " + swimDistance + "м.";
    }
}
