// Класс, представляющий задачу в системе управления проектами
class Task {
    // Поля для хранения названия, описания, срока и исполнителя задачи
    private String name;
    private String description;
    private String deadline;
    private String assignee;

    // Конструктор для создания новой задачи с заданными параметрами
    public Task(String name, String description, String deadline, String assignee) {
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.assignee = assignee;
    }

    // Геттеры и сеттеры для доступа и изменения полей задачи
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    // Метод для вывода информации о задаче в консоль
    public void printTask() {
        System.out.println("Название: " + name);
        System.out.println("Описание: " + description);
        System.out.println("Срок: " + deadline);
        System.out.println("Исполнитель: " + assignee);
    }
}
