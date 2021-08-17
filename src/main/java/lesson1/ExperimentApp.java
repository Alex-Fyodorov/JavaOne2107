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
        System.out.println("4. " + ss);

        //5. Получение длины строки.
        int ddd = sss.length();
        System.out.println("5. " + ddd);

        //6. Извлечение из строки символа, находящегося на какой-либо позиции.
        System.out.println("6. " + sss.charAt(2));

        //7. Посимвольное сравнение строк.
        String www = "SKDFJHskjh";
        System.out.println("7. " + www.equalsIgnoreCase(sss));

        //8. Объединение двух строк в одну. То же действие, что и "+".
        System.out.println("8. " + www.concat(sss));

        //9. Изменение регистра в строке.
        System.out.println("9. " + www.toLowerCase());
        System.out.println("9. " + www.toUpperCase());

        //10. Преобразование в строку.
        int xx = 123456789;
        String ff = String.valueOf(xx);
        System.out.println("10. " + ff);

        //11. Методы StringBuilder и StringBuffer
        StringBuilder sb = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        // Добавление элементов.
        sb.append("s1");
        sb.append("s2");
        sb.append("a1").append(10).append("a2").append(true);

        System.out.println(sb);
        // Объём выделенной памяти.
        System.out.println(sb.capacity());

        // Установка длины строки.
        sb.setLength(5);
        System.out.println(sb);
        sb.setLength(10);
        System.out.println(sb);

        String stringFromSB = sb.toString();



    }
}
