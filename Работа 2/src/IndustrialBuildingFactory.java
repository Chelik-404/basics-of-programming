// Класс IndustrialBuildingFactory, который наследует от класса BuildingFactory и реализует метод createBuilding()
class IndustrialBuildingFactory extends BuildingFactory {
    // Метод, который принимает адрес, площадь и количество производственных цехов и возвращает объект класса IndustrialBuilding
    public Building createBuilding(String address, double area, int factories) {
        return new IndustrialBuilding(address, area, factories);
    }
}
