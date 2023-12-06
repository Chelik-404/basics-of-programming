// Класс Cat, который наследует от класса Pet и реализует метод makeSound()
class Cat extends Pet {
    // Конструктор, который вызывает конструктор суперкласса
    public Cat(String name) {
        super(name);
    }

    // Метод, который возвращает звук, который издает кошка
    public String makeSound() {
        return "Мяу-мяу";
    }
}
