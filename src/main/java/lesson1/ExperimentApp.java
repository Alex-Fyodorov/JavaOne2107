package lesson1;

import java.util.Arrays;

public class ExperimentApp {
    public static void main(String[] args) {

        // 1. Проверка эквивалентности строк.
        String str1 = "A";
        String str2 = "A";
        String str3 = "B";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        // 2. Форматированная строка.
        String formatString = "Слово: %s, Число с плавающей запятой: %f, " +
                "Целое число: %d, Символ: %c";
        System.out.printf(formatString, "Java", 2.5f, 20, 'e');
        System.out.println();
        System.out.printf(formatString, "kdfh", 3.7f, 40, '@');
        System.out.println();

        // 3. Разделить строку на символы.
        String sss = "skdfjhskjh";
        System.out.println(sss);
        char[] aaa = sss.toCharArray();
        System.out.println(Arrays.toString(aaa));

        // 4. Объединить массив в строку.
        String ss = new String(aaa);
        System.out.println(ss);

    }
}
