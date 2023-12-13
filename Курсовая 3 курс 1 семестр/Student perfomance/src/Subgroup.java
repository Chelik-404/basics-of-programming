import java.util.ArrayList;

// Класс для представления подгруппы студентов
class Subgroup {
    // Поле для хранения списка студентов
    private ArrayList<Student> students;

    // Конструктор для создания пустой подгруппы
    public Subgroup() {
        students = new ArrayList<Student>();
    }

    // Метод для добавления студента в подгруппу
    public void addStudent(Student student) {
        students.add(student);
    }

    // Метод для удаления студента из подгруппы по заданному индексу
    public void removeStudent(int index) {
        students.remove(index);
    }

    // Метод для получения студента из подгруппы по заданному индексу
    public Student getStudent(int index) {
        return students.get(index);
    }

    // Метод для получения количества студентов в подгруппе
    public int getSize() {
        return students.size();
    }

    // Метод для получения списка студентов в подгруппе
    public ArrayList<Student> getStudents() {
        return students;
    }
}
