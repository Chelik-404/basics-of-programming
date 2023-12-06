// Класс, представляющий пользователя системы управления проектами
class User {
    // Поле для хранения имени пользователя
    private String name;

    // Конструктор для создания нового пользователя с заданным именем
    public User(String name) {
        this.name = name;
    }

    // Геттер и сеттер для доступа и изменения имени пользователя
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Метод для подписки на уведомления о назначении задач
    public void subscribe(Task task) {
        // Проверяем, является ли пользователь исполнителем задачи
        if (this.name.equals(task.getAssignee())) {
            // Выводим сообщение о подписке в консоль
            System.out.println(this.name + " подписался на уведомления о задаче " + task.getName());
        } else {
            // Выводим сообщение об ошибке в консоль
            System.out.println(this.name + " не может подписаться на уведомления о задаче " + task.getName() + ", так как он не является ее исполнителем");
        }
    }

    // Метод для получения уведомления о назначении задачи
    public void notify(Task task) {
        // Проверяем, является ли пользователь исполнителем задачи
        if (this.name.equals(task.getAssignee())) {
            // Выводим сообщение об уведомлении в консоль
            System.out.println(this.name + " получил уведомление о назначении задачи " + task.getName());
            // Выводим информацию о задаче в консоль
            task.printTask();
        }
    }
}
