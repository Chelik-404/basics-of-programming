import java.util.ArrayList;

// Класс для представления интерфейса для работы с данными о студентах
class Interface {
    // Поле для хранения списка групп
    private ArrayList<Group> groups;

    // Конструктор для создания пустого интерфейса
    public Interface() {
        groups = new ArrayList<Group>();
    }

    // Метод для добавления группы в интерфейс
    public void addGroup(Group group) {
        groups.add(group);
    }

    // Метод для удаления группы из интерфейса по заданному индексу
    public void removeGroup(int index) {
        groups.remove(index);
    }

    // Метод для получения группы из интерфейса по заданному индексу
    public Group getGroup(int index) {
        return groups.get(index);
    }

    // Метод для получения количества групп в интерфейсе
    public int getSize() {
        return groups.size();
    }

    // Метод для получения списка групп в интерфейсе
    public ArrayList<Group> getGroups() {
        return groups;
    }
}
