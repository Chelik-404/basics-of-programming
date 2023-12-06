// Класс BuildingFactory, который использует паттерн одиночка для создания объектов разных типов зданий
class BuildingFactory {
    // Статическая переменная, которая хранит единственный экземпляр класса factory
    private static BuildingFactory instance;

    // Приватный конструктор, который запрещает создание объектов класса factory извне
    private BuildingFactory() {
    }

    // Статический метод, который возвращает единственный экземпляр класса factory, создавая его при необходимости
    public static BuildingFactory getInstance() {
        // Если экземпляр класса factory еще не создан, то создать его
        if (instance == null) {
            instance = new BuildingFactory();
        }
        // Вернуть экземпляр класса factory
        return instance;
    }

    // Метод, который принимает тип, адрес, площадь и дополнительный параметр и возвращает объект здания
    public Building createBuilding(String type, String address, double area, int parameter) {
        // Если тип здания - жилой, то создать и вернуть объект класса ResidentialBuilding
        if (type.equalsIgnoreCase("residential")) {
            return new ResidentialBuilding(address, area, parameter);
        }
        // Если тип здания - коммерческий, то создать и вернуть объект класса CommercialBuilding
        else if (type.equalsIgnoreCase("commercial")) {
            return new CommercialBuilding(address, area, parameter);
        }
        // Если тип здания - промышленный, то создать и вернуть объект класса IndustrialBuilding
        else if (type.equalsIgnoreCase("industrial")) {
            return new IndustrialBuilding(address, area, parameter);
        }
        // Иначе вернуть null
        else {
            return null;
        }
    }
}
