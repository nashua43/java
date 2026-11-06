import java.util.Arrays;

public class Student {
    private String name;
    private int[] grades;

    // Создание студента с именем и оценками
    public Student(String name, int[] grades) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя студента не должно быть пустым.");
        }
        if (grades == null) {
            throw new IllegalArgumentException("Массив оценок не должен быть null.");
        }
        this.name = name;
        this.grades = grades;
    }

    // Создание студента только с именем
    public Student(String name) {
        this(name, new int[0]);
    }

    public String getName() { return name; }
    public int[] getGrades() { return grades; }

    // Присваивание той же ссылки на массив (поверхностное копирование)
    public void setGradesReference(int[] grades) {
        if (grades == null) throw new IllegalArgumentException("Массив оценок не должен быть null.");
        this.grades = grades;
    }

    // Копирование массива с созданием нового объекта
    public void copyGrades(Student other) {
        if (other == null) throw new IllegalArgumentException("Студент не должен быть null.");
        this.grades = other.grades.clone();
    }

    public void setGrade(int index, int grade) {
        if (index < 0 || index >= grades.length) {
            throw new IndexOutOfBoundsException("Такой оценки нет.");
        }
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть от 2 до 5.");
        }
        grades[index] = grade;
    }

    @Override
    public String toString() {
        return name + ": " + Arrays.toString(grades);
    }
}
