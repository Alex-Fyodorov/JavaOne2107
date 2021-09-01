package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {

        /**
         * Задания делаю отдельными методами не потому,
         * что в этом есть большая необходимость, а больше для тренировки,
         * чтобы запомнить, как массивы прописываются в сигнатуре.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задание 1.");
        byte[] binArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Изначальный массив:");
        System.out.println(Arrays.toString(binArray));
        System.out.println("Изменённый массив:");
        System.out.println(Arrays.toString(replaceTheValue(binArray)));
        System.out.println();

        System.out.println("Задание 2.");
        fillInTheArray(100);
        System.out.println();

        System.out.println("Задание 3.");
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Изначальный массив:");
        System.out.println(Arrays.toString(array3));
        System.out.println("Изменённый массив:");
        System.out.println(Arrays.toString(doubleByCondition(array3)));
        System.out.println();

        System.out.println("Задание 4.");
        arrayWithFilledDiagonals(9);
        System.out.println();

        System.out.println("Задание 5.");
        System.out.println("Введите длину массива.");
        int a = scanner.nextInt();
        System.out.println("Введите число, которое будет " +
                "задано всем ячейкам массива.");
        int b = scanner.nextInt();
        setAnArrayByParameters(a, b);
        System.out.println();

        System.out.println("Задание 6.");
        int[] array6 = {3, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array6));
        int[] maxAndMin = findMaxAndMin(array6);
        System.out.println("Максимальное число - " + maxAndMin[0]);
        System.out.println("Минимальное число - " + maxAndMin[1]);
        System.out.println();

        System.out.println("Задание 7.");
        int[] array7 = {3, 5, 3, 2, 11, 4, 5, 2, 4, 7, 9, 1};
        System.out.println(Arrays.toString(array7));
        System.out.println("Есть ли в данном массиве такое место,");
        System.out.println("где суммы его правых и левых частей равны?");
        System.out.println(areTheLeftAndRightSumsSame(array7));
        System.out.println();

        System.out.println("Задание 8.");
        int[] array81 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array82 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(array81));
        System.out.println("Введите величину сдвига массива.");
        int n = scanner.nextInt();
        System.out.println("Сдвиг без использования дополнительных массивов.");
        System.out.println(Arrays.toString(arrayWithShift(array81, n)));
        System.out.println("Сдвиг перекладкой в другой массив.");
        System.out.println(Arrays.toString(shiftUsingAdditionalArray(array82, n)));
    }

    /**
     * Задание 1:
     * Принимает массив с единицами и нулями
     * и меняет значения на противоположные.
     *
     * @param replace принятый массив
     * @return изменённый массив
     */
    public static byte[] replaceTheValue(byte[] replace) {
        for (int i = 0; i < replace.length; i++) {
            if (replace[i] == 1) {
                replace[i] = 0;
            } else {
                replace[i] = 1;
            }
        }
        return replace;
    }

    /**
     * Задание 2.
     * Принимает длину массива, заполняет его последовательными
     * числами, начиная с единицы, а затем печатает весь массив
     * по 10 чисел в строчке. Может принимать не только 100, как
     * в задании, но и любые другие целые положительные числа.
     * Заполнять и печатать будет правильно.
     *
     * @param lengthOfArray длина массива
     */
    public static void fillInTheArray(int lengthOfArray) {
        //Заполнение массива
        int[] array = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            array[i] = i + 1;
        }

        //Печать массива
        int tens = lengthOfArray / 10;
        for (int i = 0; i < lengthOfArray / 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array[i * 10 + j] + ", ");
            }
            System.out.println();
        }
        for (int i = tens * 10; i < lengthOfArray; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    /**
     * Задание 3.
     * Принимает массив и все значения меньше 6 увеличивает в два раза.
     *
     * @param array входящий массив
     * @return переделанный массив
     */
    public static int[] doubleByCondition(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        return array;
    }

    /**
     * Задание 4.
     * Создаёт квадратный массив заданного размера,
     * и заполняет диагонали единицами.
     *
     * @param size введённый размер
     */
    public static void arrayWithFilledDiagonals(int size) {
        byte[][] squareArray = new byte[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i || j == size - 1 - i) {
                    squareArray[i][j] = 1;
                }
                System.out.print(squareArray[i][j] + ", ");
            }
            System.out.println();
        }
    }

    /**
     * Задание 5.
     * Создаёт массив заданной длины и заполняет
     * все ячейки выбранным числом.
     *
     * @param len          длина массива
     * @param initialValue значение ячеек
     */
    public static void setAnArrayByParameters(int len, int initialValue) {
        int[] array5 = new int[len];
        Arrays.fill(array5, initialValue);
        System.out.println(Arrays.toString(array5));
    }

    /**
     * Задание 6.
     * Находит максимум и минимум в заданном массиве.
     *
     * @param array входящий массив
     * @return массив из двух чисел, максмума и минимума
     */
    public static int[] findMaxAndMin(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        return new int[]{max, min};
    }

    /**
     * Задание 7.
     * Проверяет есть ли в массиве место, относительно которого
     * сумма значений левой части равна сумме значений правой части.
     *
     * @param array входящий массив
     * @return true или false
     */
    public static boolean areTheLeftAndRightSumsSame(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < array.length; j++) {
                if (j <= i) {
                    leftSum = leftSum + array[j];
                } else {
                    rightSum = rightSum + array[j];
                }
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    /**
     * Задание 8.1, шаг первый.
     * Проводит подготовку к непосредственному сдвигу массива,
     * вычисляет положительный размер сдвига, исходя из введённого
     * значения сдвига и длинны массива.
     *
     * @param array введённый массив
     * @param shift введённый сдвиг
     * @return сдвинутый массив
     */
    public static int[] arrayWithShift(int[] array, int shift) {

        // Упрощаем, если введённый сдвиг больше длины массива.
        shift = shift % array.length;

        /* Приводим сдвиг к такому виду, чтобы при введённом
        положительном значении массив сдвигался вправо, при
        отрицательном - влево. */
        shift = (array.length - shift) % array.length;

        // Проверяем, что полученный сдвиг массива отличен от нуля.
        if (shift == 0) {
            System.out.println(Arrays.toString(array));
            return array;
        }

        /* Поскольку использовать дополнительные массивы нельзя,
        будем перекладывать числа внутри самого массива по кругу.
        Однако это не сработает, если длина массива и сдвиг кратные,
        так как один большой круг разобьётся на несколько маленьких.
        Поэтому проверяем, и результаты передаём в другой метод, который
        переложит все значения нужное количество раз. */
        if (array.length % shift == 0) {
            for (int i = 0; i < shift; i++) {
                array = shifting(array, shift, i, array.length / shift - 1);
            }
        } else if (array.length % (array.length - shift) == 0) {
            for (int i = 0; i < array.length - shift; i++) {
                array = shifting(array, shift, i, array.length / (array.length - shift) - 1);
            }
        } else {
            array = shifting(array, shift, 0, array.length - 1);
        }
        return array;
    }

    /**
     * Задание 8.1 шаг второй.
     * Метод непосредственно перекладывает числа внутри массива.
     *
     * @param shiftedArray входящий массив
     * @param shift        сдвиг
     * @param start        номер позиции, с которой начинается сдвиг
     * @param steps        количество шагов перекладки
     * @return сдвинутый массив
     */
    public static int[] shifting(int[] shiftedArray, int shift, int start, int steps) {
        int buffer = shiftedArray[start]; // Откладываем одно значение в буфер.
        int numberOfShift = start;
        for (int i = 0; i < steps; i++) {
            if (numberOfShift + shift >= shiftedArray.length) {
                shiftedArray[numberOfShift] = shiftedArray[numberOfShift + shift - shiftedArray.length];
                numberOfShift = numberOfShift + shift - shiftedArray.length;
            } else {
                shiftedArray[numberOfShift] = shiftedArray[numberOfShift + shift];
                numberOfShift = numberOfShift + shift;
            }
        }
        shiftedArray[numberOfShift] = buffer; // Возвращаем из буфера в нужное место.
        return shiftedArray;
    }

    /**
     * Задание 8.2.
     * Сдвиг массива путём простого перкладывания чисел в такой же
     * массив с нужным сдвигом.
     *
     * @param array входящий массив
     * @param shift сдвиг
     * @return массив со сдвигом
     */
    public static int[] shiftUsingAdditionalArray(int[] array, int shift) {
        // Упрощаем, если введённый сдвиг больше длины массива.
        shift = shift % array.length;

        /* Приводим сдвиг к такому виду, чтобы при введённом
        положительном значении массив сдвигался вправо, при
        отрицательном - влево. */
        shift = (array.length + shift) % array.length;

        // Проверяем, что полученный сдвиг массива отличен от нуля.
        if (shift == 0) {
            System.out.println(Arrays.toString(array));
            return array;
        }

        // Сам сдвиг цикла.
        int[] shiftedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i + shift >= array.length) {
                shiftedArray[i + shift - array.length] = array[i];
            } else {
                shiftedArray[i + shift] = array[i];
            }
        }
        return shiftedArray;
    }
}
