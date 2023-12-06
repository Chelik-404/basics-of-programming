// Абстрактный класс Building, который определяет общие свойства и методы для всех зданий
abstract class Building {
    // Адрес здания
    protected String address;
    // Площадь здания
    protected double area;

    // Конструктор, который принимает адрес и площадь здания
    public Building(String address, double area) {
        this.address = address;
        this.area = area;
    }

    // Абстрактный метод, который возвращает тип здания
    public abstract String getType();

    // Метод, который возвращает адрес здания
    public String getAddress() {
        return address;
    }

    // Метод, который возвращает площадь здания
    public double getArea() {
        return area;
    }
}
