// Абстрактный класс BuildingFactory, который определяет общий интерфейс для создания объектов разных типов зданий
abstract class BuildingFactory {
    // Абстрактный метод, который принимает адрес, площадь и дополнительный параметр и возвращает объект здания
    public abstract Building createBuilding(String address, double area, int parameter);
}
