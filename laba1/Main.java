import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main app = new Main();

        // ============ Задание 1. Методы ============

        System.out.println("=== Задание 1. Задача 1. Дробная часть ===");
        System.out.println("Число: 5,25");
        System.out.println("Дробная часть: " + app.fraction(5.25));

        System.out.println("\n=== Задание 1. Задача 2. Сумма знаков ===");
        System.out.println("Число: 4568");
        System.out.println("Сумма двух последних цифр: " + app.sumLastNums(4568));

        System.out.println("\n=== Задание 1. Задача 3. Букву в число ===");
        System.out.println("Символ: '3'");
        System.out.println("Число: " + app.charToNum('3'));

        System.out.println("\n=== Задание 1. Задача 4. Есть ли позитив ===");
        System.out.println("Число: 3 -> " + app.isPositive(3));
        System.out.println("Число: -5 -> " + app.isPositive(-5));

        System.out.println("\n=== Задание 1. Задача 5. Двузначное ===");
        System.out.println("Число: 32 -> " + app.is2Digits(32));
        System.out.println("Число: 516 -> " + app.is2Digits(516));

        // ============ Задание 2. Условия ============

        System.out.println("\n=== Задание 2. Задача 1. Модуль числа ===");
        System.out.println("x = 5  -> " + app.abs(5));
        System.out.println("x = -3 -> " + app.abs(-3));

        System.out.println("\n=== Задание 2. Задача 2. Безопасное деление ===");
        System.out.println("5 / 0 = " + app.safeDiv(5, 0));
        System.out.println("8 / 2 = " + app.safeDiv(8, 2));

        System.out.println("\n=== Задание 2. Задача 3. Тридцать пять ===");
        System.out.println("x = 5  -> " + app.is35(5));
        System.out.println("x = 8  -> " + app.is35(8));
        System.out.println("x = 15 -> " + app.is35(15));

        System.out.println("\n=== Задание 2. Задача 4. Строка сравнения ===");
        System.out.println(app.makeDecision(5, 7));
        System.out.println(app.makeDecision(8, -1));
        System.out.println(app.makeDecision(4, 4));

        System.out.println("\n=== Задание 2. Задача 5. Тройной максимум ===");
        System.out.println("5, 7, 7  -> " + app.max3(5, 7, 7));
        System.out.println("8, -1, 4 -> " + app.max3(8, -1, 4));

        // ============ Задание 3. Циклы ============

        System.out.println("\n=== Задание 3. Задача 1. Числа подряд ===");
        System.out.println("x = 5 -> " + app.listNums(5));

        System.out.println("\n=== Задание 3. Задача 2. Числа наоборот ===");
        System.out.println("x = 5 -> " + app.reverseListNums(5));

        System.out.println("\n=== Задание 3. Задача 3. Чётные числа ===");
        System.out.println("x = 9 -> " + app.chet(9));

        System.out.println("\n=== Задание 3. Задача 4. Степень числа ===");
        System.out.println("2 в степени 5 = " + app.pow(2, 5));

        System.out.println("\n=== Задание 3. Задача 5. Длина числа ===");
        System.out.println("x = 12567 -> " + app.numLen(12567));

        // ============ Задание 4. Массивы ============

        System.out.println("\n=== Задание 4. Задача 1. Поиск первого значения ===");
        int[] arr1 = {1, 2, 3, 4, 2, 2, 5};
        System.out.println("Массив: " + Arrays.toString(arr1));
        System.out.println("Индекс первого вхождения 2: " + app.findFirst(arr1, 2));

        System.out.println("\n=== Задание 4. Задача 2. Поиск последнего значения ===");
        System.out.println("Массив: " + Arrays.toString(arr1));
        System.out.println("Индекс последнего вхождения 2: " + app.findLast(arr1, 2));

        System.out.println("\n=== Задание 4. Задача 3. Поиск максимального ===");
        int[] arr2 = {1, -2, -7, 4, 2, 2, 5};
        System.out.println("Массив: " + Arrays.toString(arr2));
        System.out.println("Максимум по модулю: " + app.maxAbs(arr2));

        System.out.println("\n=== Задание 4. Задача 4. Добавление в массив ===");
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("Исходный: " + Arrays.toString(arr3));
        System.out.println("Вставить 9 в позицию 3: " + Arrays.toString(app.add(arr3, 9, 3)));

        System.out.println("\n=== Задание 4. Задача 5. Добавление массива в массив ===");
        int[] arrA = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        System.out.println("arr: " + Arrays.toString(arrA));
        System.out.println("ins: " + Arrays.toString(ins));
        System.out.println("Вставить ins в позицию 3: " + Arrays.toString(app.add(arrA, ins, 3)));

        
    }

    // ============ Задание 1. Методы ============

    // 1. Дробная часть
    public double fraction(double x) {
        int whole = (int) x;
        return x - whole;
    }

    // 2. Сумма знаков
    public int sumLastNums(int x) {
        int abs = Math.abs(x);
        int last = abs % 10;
        int preLast = (abs / 10) % 10;
        return last + preLast;
    }

    // 3. Букву в число
    public int charToNum(char x) {
        return x - '0';
    }

    // 4. Есть ли позитив
    public boolean isPositive(int x) {
        return x > 0;
    }

    // 5. Двузначное
    public boolean is2Digits(int x) {
        int abs = Math.abs(x);
        return abs >= 10 && abs <= 99;
    }

    // ============ Задание 2. Условия ============

    // 1. Модуль числа
    public int abs(int x) {
        return x < 0 ? -x : x;
    }

    // 2. Безопасное деление
    public double safeDiv(int x, int y) {
        if (y == 0) return 0;
        return (double) x / y;
    }

    // 3. Тридцать пять
    public boolean is35(int x) {
        boolean div3 = (x % 3 == 0);
        boolean div5 = (x % 5 == 0);
        return div3 ^ div5;
    }

    // 4. Строка сравнения
    public String makeDecision(int x, int y) {
        if (x < y) return x + " < " + y;
        if (x > y) return x + " > " + y;
        return x + " == " + y;
    }

    // 5. Тройной максимум
    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }

    // ============ Задание 3. Циклы ============

    // 1. Числа подряд
    public String listNums(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            if (i > 0) sb.append(" ");
            sb.append(i);
        }
        return sb.toString();
    }

    // 2. Числа наоборот
    public String reverseListNums(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = x; i >= 0; i--) {
            if (i < x) sb.append(" ");
            sb.append(i);
        }
        return sb.toString();
    }

    // 3. Чётные числа
    public String chet(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            sb.append(i).append(" ");
        }
        return sb.toString().trim();
    }

    // 4. Степень числа
    public int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    // 5. Длина числа
    public int numLen(long x) {
        if (x == 0) return 1;
        long abs = Math.abs(x);
        int count = 0;
        while (abs > 0) {
            abs /= 10;
            count++;
        }
        return count;
    }

    // ============ Задание 4. Массивы ============

    // 1. Поиск первого значения
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    // 2. Поиск последнего значения
    public int findLast(int[] arr, int x) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) index = i;
        }
        return index;
    }

    // 3. Поиск максимального по модулю
    public int maxAbs(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }
        int best = arr[0];
        int bestAbs = Math.abs(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int curAbs = Math.abs(arr[i]);
            if (curAbs > bestAbs) {
                bestAbs = curAbs;
                best = arr[i];
            }
        }
        return best;
    }

    // 4. Добавление в массив
    public int[] add(int[] arr, int x, int pos) {
        int[] res = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) res[i] = arr[i];
        res[pos] = x;
        for (int i = pos; i < arr.length; i++) res[i + 1] = arr[i];
        return res;
    }

    // 5. Добавление массива в массив
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] res = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) res[i] = arr[i];
        for (int i = 0; i < ins.length; i++) res[pos + i] = ins[i];
        for (int i = pos; i < arr.length; i++) res[i + ins.length] = arr[i];
        return res;
    }

    
}
