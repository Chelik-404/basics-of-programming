// Класс CommercialBuilding, который наследует от класса Building и реализует метод getType()
class CommercialBuilding extends Building {
    // Количество магазинов в здании
    private int shops;

    // Конструктор, который вызывает конструктор суперкласса и принимает количество магазинов
    public CommercialBuilding(String address, double area, int shops) {
        super(address, area);
        this.shops = shops;
    }

    // Метод, который возвращает тип здания
    public String getType() {
        return "Коммерческий";
    }

    // Метод, который возвращает количество магазинов в здании
    public int getShops() {
        return shops;
    }
}
