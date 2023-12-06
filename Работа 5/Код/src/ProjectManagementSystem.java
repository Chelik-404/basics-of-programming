import java.util.ArrayList;

// Класс, представляющий систему управления проектами
class ProjectManagementSystem {
    // Поле для хранения списка задач в системе
    private ArrayList<Task> tasks;

    // Конструктор для создания новой системы управления проектами
    public ProjectManagementSystem() {
        // Инициализируем список задач пустым
        tasks = new ArrayList<Task>();
    }

    // Метод для добавления новой задачи в систему
    public void addTask(Task task) {
        // Добавляем задачу в список
        tasks.add(task);
        // Выводим сообщение о добавлении задачи в консоль
        System.out.println("Задача " + task.getName() + " добавлена в систему");
    }

    // Метод для назначения задачи пользователю
    public void assignTask(Task task, User user) {
        // Устанавливаем исполнителя задачи равным имени пользователя
        task.setAssignee(user.getName());
        // Выводим сообщение о назначении задачи в консоль
        System.out.println("Задача " + task.getName() + " назначена пользователю " + user.getName());
        // Отправляем уведомление пользователю о назначении задачи
        user.notify(task);
    }
}
