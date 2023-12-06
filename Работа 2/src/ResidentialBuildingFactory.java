// Класс ResidentialBuildingFactory, который наследует от класса BuildingFactory и реализует метод createBuilding()
class ResidentialBuildingFactory extends BuildingFactory {
    // Метод, который принимает адрес, площадь и количество жильцов и возвращает объект класса ResidentialBuilding
    public Building createBuilding(String address, double area, int residents) {
        return new ResidentialBuilding(address, area, residents);
    }
}
