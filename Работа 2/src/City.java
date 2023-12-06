import java.util.ArrayList;

// Класс City, который содержит список зданий в городе и методы для работы с ними
class City {
    // Список зданий в городе
    private ArrayList<Building> buildings;

    // Конструктор, который создает пустой список зданий
    public City() {
        buildings = new ArrayList<Building>();
    }

    // Метод, который добавляет здание в список
    public void addBuilding(Building building) {
        buildings.add(building);
    }

    // Метод, который возвращает список зданий в городе
    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    // Метод, который возвращает общую площадь всех зданий в городе
    public double getTotalArea() {
        double totalArea = 0;
        for (Building building : buildings) {
            totalArea += building.getArea();
        }
        return totalArea;
    }

    // Метод, который возвращает количество зданий определенного типа в городе
    public int countBuildingsByType(String type) {
        int count = 0;
        for (Building building : buildings) {
            if (building.getType().equals(type)) {
                count++;
            }
        }
        return count;
    }
}
