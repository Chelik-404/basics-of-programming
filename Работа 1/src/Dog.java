// Класс Dog, который наследует от класса Pet и реализует метод makeSound()
class Dog extends Pet {
    // Конструктор, который вызывает конструктор суперкласса
    public Dog(String name) {
        super(name);
    }

    // Метод, который возвращает звук, который издает собака
    public String makeSound() {
        return "Гав-гав";
    }
}
