// Класс Main, который содержит точку входа в программу
class Main {
    // Главный метод, который демонстрирует работу абстрактной фабрики
    public static void main(String[] args) {
        // Создать объекты разных типов фабрик зданий
        BuildingFactory residentialBuildingFactory = new ResidentialBuildingFactory();
        BuildingFactory commercialBuildingFactory = new CommercialBuildingFactory();
        BuildingFactory industrialBuildingFactory = new IndustrialBuildingFactory();
        // Создать объект класса City
        City city = new City();
        // Добавить в город здания разных типов с помощью абстрактной фабрики
        city.addBuilding(residentialBuildingFactory.createBuilding("ул. Ленина, 1", 1000, 50));
        city.addBuilding(commercialBuildingFactory.createBuilding("пр. Мира, 10", 2000, 20));
        city.addBuilding(industrialBuildingFactory.createBuilding("ул. Заводская, 5", 3000, 10));
        city.addBuilding(residentialBuildingFactory.createBuilding("ул. Садовая, 15", 1500, 40));
        city.addBuilding(commercialBuildingFactory.createBuilding("пр. Победы, 20", 2500, 30));
        city.addBuilding(industrialBuildingFactory.createBuilding("ул. Промышленная, 7", 3500, 15));
        city.addBuilding(residentialBuildingFactory.createBuilding("ул. Высотского, 69", 2998, 12));
        // Вывести на экран информацию о городе
        System.out.println("В городе " + city.getBuildings().size() + " зданий");
        System.out.println("Общая площадь всех зданий: " + city.getTotalArea() + " кв.м");
        System.out.println("Количество жилых зданий: " + city.countBuildingsByType("Жилой"));
        System.out.println("Количество коммерческих зданий: " + city.countBuildingsByType("Коммерческий"));
        System.out.println("Количество промышленных зданий: " + city.countBuildingsByType("Промышленный"));
    }
}
