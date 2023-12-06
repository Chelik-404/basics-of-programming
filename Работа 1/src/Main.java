// Класс Main, который содержит точку входа в программу
class Main {
    // Главный метод, который демонстрирует работу фабричного метода
    public static void main(String[] args) {
        // Создать объект класса PetFactory
        PetFactory petFactory = new PetFactory();
        // Создать объекты разных видов домашних животных с помощью фабричного метода
        Pet dog = petFactory.createPet("dog", "Бобик");
        Pet cat = petFactory.createPet("cat", "Мурка");
        Pet parrot = petFactory.createPet("parrot", "Кеша");
        // Вывести на экран имена и звуки домашних животных
        System.out.println(dog.getName() + " говорит " + dog.makeSound());
        System.out.println(cat.getName() + " говорит " + cat.makeSound());
        System.out.println(parrot.getName() + " говорит " + parrot.makeSound());
    }
}
