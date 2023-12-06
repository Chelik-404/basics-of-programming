// Класс Parrot, который наследует от класса Pet и реализует метод makeSound()
class Parrot extends Pet {
    // Конструктор, который вызывает конструктор суперкласса
    public Parrot(String name) {
        super(name);
    }

    // Метод, который возвращает звук, который издает попугай
    public String makeSound() {
        return "СВОБОДУ ПОПУГАЯМ!!!";
    }
}
