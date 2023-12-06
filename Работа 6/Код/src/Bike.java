// Класс Bike, который наследует от класса Transport и реализует методы start() и stop()
class Bike extends Transport {
    // Переопределение метода start()
    @Override
    void start() {
        System.out.println("Pedaling the bike");
    }

    // Переопределение метода stop()
    @Override
    void stop() {
        System.out.println("Braking the bike");
    }
}
