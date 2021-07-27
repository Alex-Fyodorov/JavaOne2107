package lesson2;

public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println("Задание 1:");
        int a = 10;
        int b = 5;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Сумма чисел a и b должна быть больше 10 и меньше 20.");
        System.out.println(sum(a, b));
        System.out.println();
        System.out.println("Задание 2:");
        int c = 17;
        System.out.println("Введено число " + c + ".");
        check(c);
        System.out.println();
        System.out.println("Задание 3:");
        int d = 17;
        System.out.println("Введено число " + d + ".");
        System.out.println("Отрицательное ли это число?");
        System.out.println(check2(d));
        System.out.println();
        System.out.println("Задание 4:");
        String m = "Будем печатать эту строку.";
        int m2 = 5;
        System.out.println("Количество - " + m2 + ".");
        cycle (m, m2);
        System.out.println();
        System.out.println("Задание 5:");
        int year = 2021;
        System.out.println("Високосный ли год " + year + "?");
        System.out.println(year(year));
    }

    /**
     * Задание 1.
     * Проверяет, лежит ли сумма чисел a и b в диапазоне
     * между 10 включительно и 20 включительно.
     *
     * @param a первое число
     * @param b второе число
     * @return возвращает true или false
     */
    public static boolean sum(int a, int b) {
        int s = a + b;
        return s >= 10 && s <= 20;
    }

    /**
     * Задание 2.
     * Проверяет, число на положительность/отрицательность
     * и печатает соответствующий вердикт.
     *
     * @param c введённое число
     */
    public static void check(int c) {
        if (c >= 0) {
            System.out.println("Число " + c + " положительное.");
        } else {
            System.out.println("Число " + c + " отрицательное.");
        }
    }

    /**
     * Задание 3.
     * Проверяет число на отрицательность.
     *
     * @param d введённое число
     * @return возвращает true или false
     */
    public static boolean check2(int d) {
        return d < 0;
    }

    /**
     * Задание 4.
     * Печатает введённую строку нужное число раз.
     *
     * @param m введённая строка
     * @param m2 количество раз печати
     */
    public static void cycle(String m, int m2) {
        for (int i = 0; i < m2; i ++) {
            System.out.println(m);
        }
    }

    /**
     * Задание 5.
     * Проверяет год на високосность.
     * Каждый 4-й год является високосным,
     * кроме каждого 100-го, при этом каждый 400-й – високосный.
     *
     * @param y введённый год
     * @return  возвращает true или false
     */
    public static boolean year(int y) {
        return y % 400 == 0 || y % 4 == 0 && y % 100 != 0;
    }
}
