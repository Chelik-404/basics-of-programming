import java.util.ArrayList;
import java.util.List;

// Класс для представления музыкальной коллекции, которая может содержать другие музыкальные элементы
class MusicCollection extends MusicElement {
    // Название коллекции
    private String name;
    // Список музыкальных элементов, входящих в коллекцию
    private List<MusicElement> elements;

    // Конструктор коллекции
    public MusicCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    // Метод для добавления музыкального элемента в коллекцию
    public void addElement(MusicElement element) {
        elements.add(element);
    }

    // Метод для удаления музыкального элемента из коллекции
    public void removeElement(MusicElement element) {
        elements.remove(element);
    }

    // Метод для воспроизведения коллекции
    @Override
    void play() {
        System.out.println("Playing collection: " + name);
        for (MusicElement element : elements) {
            element.play();
        }
    }
}
