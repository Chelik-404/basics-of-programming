// Абстрактный класс Pet, который определяет общие свойства и методы для всех домашних животных
abstract class Pet {
    // Имя домашнего животного
    protected String name;

    // Конструктор, который принимает имя домашнего животного
    public Pet(String name) {
        this.name = name;
    }

    // Абстрактный метод, который возвращает звук, который издает домашнее животное
    public abstract String makeSound();

    // Метод, который возвращает имя домашнего животного
    public String getName() {
        return name;
    }
}
