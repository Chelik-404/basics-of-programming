// Класс Main, который содержит точку входа в программу
public class Main {
    // Метод main, который создает объекты разных видов транспорта и вызывает их метод move()
    public static void main(String[] args) {
        // Создание объекта car типа Car
        Car car = new Car();
        // Вызов метода move() для объекта car
        car.move();
        // Создание объекта bike типа Bike
        Bike bike = new Bike();
        // Вызов метода move() для объекта bike
        bike.move();
        // Создание объекта train типа Train
        Train train = new Train();
        // Вызов метода move() для объекта train
        train.move();
    }
}
