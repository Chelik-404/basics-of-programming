// Импортируем необходимые классы из библиотеки Swing
import javax.swing.*;
import java.awt.event.*;

// Класс для тестирования кода
class Main {
    public static void main(String[] args) {
        // Создаем интерфейс
        Interface interface1 = new Interface();

        // Создаем две группы
        Group group1 = new Group("Группа У-214");
        Group group2 = new Group("Группа У-215");

        // Добавляем группы в интерфейс
        interface1.addGroup(group1);
        interface1.addGroup(group2);

        // Создаем 24 студентов с разными именами, фамилиями и оценками
        Student student1 = new Student("Дмитрий", "Аралов", new int[]{90, 85, 80, 75, 70, 65, 60, 55, 50});
        Student student2 = new Student("Глеб", "Бакланов", new int[]{91, 86, 81, 76, 71, 66, 61, 56, 51});
        Student student3 = new Student("Иван", "Бакланов", new int[]{92, 87, 82, 77, 72, 67, 62, 57, 52});
        Student student4 = new Student("Денис", "Беликов", new int[]{93, 88, 83, 78, 73, 68, 63, 58, 53});
        Student student5 = new Student("Вячеслав", "Бондаренков", new int[]{87, 86, 60, 67, 94, 86, 85, 90, 85});
        Student student6 = new Student("Максим", "Бурец", new int[]{95, 90, 85, 80, 75, 70, 65, 60, 55});
        Student student7 = new Student("Артём", "Гунькин", new int[]{96, 91, 86, 81, 76, 71, 66, 61, 56});
        Student student8 = new Student("Никита", "Иванов", new int[]{97, 92, 87, 82, 77, 72, 67, 62, 57});
        Student student9 = new Student("Владислав", "Индюков", new int[]{98, 93, 88, 83, 78, 73, 68, 63, 58});
        Student student10 = new Student("Алина", "Каплуновская", new int[]{99, 94, 89, 84, 79, 74, 69, 64, 59});
        Student student11 = new Student("Тимофей", "Карамов", new int[]{100, 95, 90, 85, 80, 75, 70, 65, 60});
        Student student12 = new Student("Анна", "Киселева", new int[]{89, 84, 79, 74, 69, 64, 59, 54, 49});
        Student student13 = new Student("Никита", "Кулаков", new int[]{88, 83, 78, 73, 68, 63, 58, 53, 48});
        Student student14 = new Student("Владимир", "Ларин", new int[]{87, 82, 77, 72, 67, 62, 57, 52, 47});
        Student student15 = new Student("Мария", "Лисицкая", new int[]{86, 81, 76, 71, 66, 61, 56, 51, 46});
        Student student16 = new Student("Павел", "Лисицкий", new int[]{85, 80, 75, 70, 65, 60, 55, 50, 45});
        Student student17 = new Student("Никита", "Лямзин", new int[]{84, 79, 74, 69, 64, 59, 54, 49, 44});
        Student student18 = new Student("Кирилл", "Мандрыгин", new int[]{83, 78, 73, 68, 63, 58, 53, 48, 43});
        Student student19 = new Student("Вадим", "Моисеенко", new int[]{82, 77, 72, 67, 62, 57, 52, 47, 42});
        Student student20 = new Student("Михаил", "Ревякин", new int[]{81, 76, 71, 66, 61, 56, 51, 46, 41});
        Student student21 = new Student("Андрей", "Рощупкин", new int[]{80, 75, 70, 65, 60, 55, 50, 45, 40});
        Student student22 = new Student("Елизавета", "Соболева", new int[]{79, 74, 69, 64, 59, 54, 49, 44, 39});
        Student student23 = new Student("Андрей", "Сушков", new int[]{78, 73, 68, 63, 58, 53, 48, 43, 38});
        Student student24 = new Student("Кирилл", "Чичин", new int[]{77, 72, 67, 62, 57, 52, 47, 42, 37});

        // Добавляем студентов в подгруппы
        group1.getSubgroup1().addStudent(student1);
        group1.getSubgroup1().addStudent(student2);
        group1.getSubgroup1().addStudent(student3);
        group1.getSubgroup1().addStudent(student4);
        group1.getSubgroup1().addStudent(student5);
        group1.getSubgroup1().addStudent(student6);
        group1.getSubgroup2().addStudent(student7);
        group1.getSubgroup2().addStudent(student8);
        group1.getSubgroup2().addStudent(student9);
        group1.getSubgroup2().addStudent(student10);
        group1.getSubgroup2().addStudent(student11);
        group1.getSubgroup2().addStudent(student12);
        group2.getSubgroup1().addStudent(student13);
        group2.getSubgroup1().addStudent(student14);
        group2.getSubgroup1().addStudent(student15);
        group2.getSubgroup1().addStudent(student16);
        group2.getSubgroup1().addStudent(student17);
        group2.getSubgroup1().addStudent(student18);
        group2.getSubgroup2().addStudent(student19);
        group2.getSubgroup2().addStudent(student20);
        group2.getSubgroup2().addStudent(student21);
        group2.getSubgroup2().addStudent(student22);
        group2.getSubgroup2().addStudent(student23);
        group2.getSubgroup2().addStudent(student24);

        // Создаем графический интерфейс с заданным интерфейсом
        GUI gui = new GUI(interface1);
    }
}
