// Класс Train, который наследует от класса Transport и реализует методы start() и stop()
class Train extends Transport {
    // Переопределение метода start()
    @Override
    void start() {
        System.out.println("Accelerating the train");
    }

    // Переопределение метода stop()
    @Override
    void stop() {
        System.out.println("Decelerating the train");
    }
}
