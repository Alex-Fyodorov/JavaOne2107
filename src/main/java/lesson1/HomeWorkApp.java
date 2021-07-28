package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Задание 2:");
        printThreeWords();
        System.out.println();
        System.out.println("Задание 3:");
        checkSumSign();
        System.out.println();
        System.out.println("Задание 4:");
        printColor();
        System.out.println();
        System.out.println("Задание 5:");
        compareNumbers();


    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = -20;
        System.out.println("a = " + a + ", b = " + b);
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int a = 10;
        System.out.println("a = " + a);
        if (a <= 0) {
            System.out.println("Красный");
        } else if (a > 0 && a <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
        /* Я понимаю, что можно было сделать проще, без логического
        оператора "И", но сделал так больше для того, чтобы показать,
        что знаю и умею. Также при ветвлении можно было обойтись без
        фигурных скобок. Если выполняемый код занимает одну строку,
        то они не обязательны, хотя, наверное, всё равно желательны
        на всякий случай, если придётся дописывать. :)
         */
    }

    public static void compareNumbers() {
        int a = 125;
        int b = 478;
        System.out.println("a = " + a + ", b = " + b);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }
}
