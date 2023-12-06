// Класс CommercialBuildingFactory, который наследует от класса BuildingFactory и реализует метод createBuilding()
class CommercialBuildingFactory extends BuildingFactory {
    // Метод, который принимает адрес, площадь и количество магазинов и возвращает объект класса CommercialBuilding
    public Building createBuilding(String address, double area, int shops) {
        return new CommercialBuilding(address, area, shops);
    }
}
