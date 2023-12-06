// Абстрактный класс Transport, который определяет общий шаблонный метод move()
abstract class Transport {
    // Абстрактный метод start(), который должен быть реализован в подклассах
    abstract void start();

    // Абстрактный метод stop(), который должен быть реализован в подклассах
    abstract void stop();

    // Конкретный метод move(), который вызывает методы start() и stop()
    final void move() {
        start();
        System.out.println("Moving...");
        stop();
    }
}
