// Класс Car, который наследует от класса Transport и реализует методы start() и stop()
class Car extends Transport {
    // Переопределение метода start()
    @Override
    void start() {
        System.out.println("Starting the car engine");
    }

    // Переопределение метода stop()
    @Override
    void stop() {
        System.out.println("Stopping the car");
    }
}
