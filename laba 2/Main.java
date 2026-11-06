import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ЛАБОРАТОРНАЯ РАБОТА №2. Вариант 1");

        // ЗАДАНИЕ 1.1 — Три точки
        System.out.println("\\nЗАДАНИЕ 1.1. ТОЧКИ");
        Point p1 = readPoint("Введите координаты первой точки");
        Point p2 = readPoint("Введите координаты второй точки");
        Point p3 = readPoint("Введите координаты третьей точки");
        System.out.println("Созданные точки:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // ЗАДАНИЕ 2.1 и ЗАДАНИЕ 4.2 — Линии
        System.out.println("\\nЗАДАНИЕ 2.1. ЛИНИИ И СВЯЗЬ МЕЖДУ НИМИ");
        System.out.println("Для проверки задания введите координаты из условия:");
        System.out.println("Линия 1: начало (1;3), конец (23;8).");
        System.out.println("Линия 2: начало (5;10), конец (25;10).");
        Line line1 = new Line(
                readDouble("x1 линии 1"), readDouble("y1 линии 1"),
                readDouble("x2 линии 1"), readDouble("y2 линии 1")
        );
        Line line2 = new Line(
                readDouble("x1 линии 2"), readDouble("y1 линии 2"),
                readDouble("x2 линии 2"), readDouble("y2 линии 2")
        );

        // Третья линия использует те же объекты точек, что и первая/вторая линии.
        Line line3 = new Line(line1.getStart(), line2.getEnd());
        System.out.println("\\nИсходные линии:");
        System.out.println("1) " + line1);
        System.out.println("2) " + line2);
        System.out.println("3) " + line3);

        // Изменяем координаты существующих точек — третья линия тоже меняется.
        line1.getStart().setCoordinates(2, 4);
        line2.getEnd().setCoordinates(30, 10);
        System.out.println("\\nПосле изменения координат общих точек:");
        System.out.println("1) " + line1);
        System.out.println("2) " + line2);
        System.out.println("3) " + line3);

        // Заменяем начальную точку первой линии новым объектом.
        // Третья линия продолжает ссылаться на старую точку.
        line1.setStart(new Point(100, 100));
        System.out.println("\\nПосле замены начальной точки линии 1:");
        System.out.println("1) " + line1);
        System.out.println("3) " + line3);

        // Демонстрация второго конструктора из задания 4.2
        Line lineByCoordinates = new Line(1, 3, 23, 8);
        System.out.println("\\nЛиния, созданная через четыре координаты: " + lineByCoordinates);

        // ЗАДАНИЕ 3.1 — Студенты и копирование массива
        System.out.println("\\nЗАДАНИЕ 3.1. СТУДЕНТЫ");
        System.out.println("Для примера из условия введите оценки Васи: 3 4 5.");
        int[] vasyaGrades = readGrades();
        Student vasya = new Student("Вася", vasyaGrades);

        Student petya = new Student("Петя");
        petya.setGradesReference(vasya.getGrades()); // одна и та же ссылка на массив
        petya.setGrade(0, 5);

        System.out.println("\\nПосле замены первой оценки Пети на 5:");
        System.out.println(vasya);
        System.out.println(petya);
        System.out.println("Оценки изменились у обоих студентов, потому что массив общий.");

        Student andrey = new Student("Андрей");
        andrey.copyGrades(vasya); // отдельная копия массива
        vasya.setGrade(1, readGrade("Введите новую вторую оценку Васи (2–5)"));
        System.out.println("\\nПосле изменения второй оценки Васи:");
        System.out.println(vasya);
        System.out.println(petya);
        System.out.println(andrey);
        System.out.println("Оценки Андрея не изменились, потому что его массив скопирован отдельно.");

        // ЗАДАНИЕ 4.1 — Точки с координатами из условия
        System.out.println("\\nЗАДАНИЕ 4.1. СОЗДАНИЕ ТОЧЕК");
        Point a = new Point(3, 5);
        Point b = new Point(25, 6);
        Point c = new Point(7, 8);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // ЗАДАНИЕ 5.3 — Длина линии
        System.out.println("\\nЗАДАНИЕ 5.3. ДЛИНА ЛИНИИ");
        Line lengthLine = new Line(new Point(1, 1), new Point(10, 15));
        System.out.println(lengthLine);
        System.out.println("Длина линии (целое число): " + lengthLine.getLength());

        System.out.println("\\nРабота программы завершена.");
    }

    private static Point readPoint(String message) {
        System.out.println(message + " (два числа через пробел):");
        double x = readDouble("X");
        double y = readDouble("Y");
        return new Point(x, y);
    }

    private static double readDouble(String message) {
        while (true) {
            System.out.print(message + ": ");
            String value = scanner.nextLine().trim().replace(',', '.');
            try {
                double number = Double.parseDouble(value);
                if (Double.isFinite(number)) return number;
                System.out.println("Ошибка: введите конечное число.");
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: нужно ввести число. Попробуйте ещё раз.");
            }
        }
    }

    private static int[] readGrades() {
        int[] grades = new int[3];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = readGrade("Оценка " + (i + 1) + " (2–5)");
        }
        return grades;
    }

    private static int readGrade(String message) {
        while (true) {
            System.out.print(message + ": ");
            String value = scanner.nextLine().trim();
            try {
                int grade = Integer.parseInt(value);
                if (grade >= 2 && grade <= 5) return grade;
                System.out.println("Ошибка: оценка должна быть от 2 до 5.");
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число.");
            }
        }
    }
}
