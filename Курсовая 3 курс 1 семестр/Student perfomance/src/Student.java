// Класс для представления студента
class Student {
    // Поля для имени, фамилии и оценок по 9 предметам
    private String firstName;
    private String lastName;
    private int[] grades;

    // Конструктор для создания студента с заданными именем, фамилией и оценками
    public Student(String firstName, String lastName, int[] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    // Метод для получения имени студента
    public String getFirstName() {
        return firstName;
    }

    // Метод для получения фамилии студента
    public String getLastName() {
        return lastName;
    }

    // Метод для получения оценки студента по заданному предмету
    public int getGrade(int subject) {
        return grades[subject];
    }

    // Метод для установки оценки студента по заданному предмету
    public void setGrade(int subject, int grade) {
        grades[subject] = grade;
    }

    // Метод для получения массива оценок студента
    public int[] getGrades() {
        return grades;
    }
}
