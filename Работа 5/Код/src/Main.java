// Класс, содержащий точку входа в программу
class Main {
    // Метод, запускающий программу
    public static void main(String[] args) {
        // Создаем новую систему управления проектами
        ProjectManagementSystem pms = new ProjectManagementSystem();

        // Создаем новых пользователей
        User alice = new User("Алиса");
        User bob = new User("Боб");
        User charlie = new User("Чарли");

        // Создаем новые задачи
        Task task1 = new Task("Написать отчет", "Написать отчет о проделанной работе за месяц", "01.01.2024", "");
        Task task2 = new Task("Протестировать программу", "Протестировать работоспособность программы на разных платформах", "15.12.2023", "");

        // Добавляем задачи в систему
        pms.addTask(task1);
        pms.addTask(task2);

        // Подписываем пользователей на уведомления о назначении задач
        alice.subscribe(task1);
        bob.subscribe(task2);
        charlie.subscribe(task1);

        // Назначаем задачи пользователям
        pms.assignTask(task1, alice);
        pms.assignTask(task2, bob);
    }
}
