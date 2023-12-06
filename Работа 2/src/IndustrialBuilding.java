// Класс IndustrialBuilding, который наследует от класса Building и реализует метод getType()
class IndustrialBuilding extends Building {
    // Количество производственных цехов в здании
    private int factories;

    // Конструктор, который вызывает конструктор суперкласса и принимает количество производственных цехов
    public IndustrialBuilding(String address, double area, int factories) {
        super(address, area);
        this.factories = factories;
    }

    // Метод, который возвращает тип здания
    public String getType() {
        return "Промышленный";
    }

    // Метод, который возвращает количество производственных цехов в здании
    public int getFactories() {
        return factories;
    }
}
