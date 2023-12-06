// Класс ResidentialBuilding, который наследует от класса Building и реализует метод getType()
class ResidentialBuilding extends Building {
    // Количество жильцов в здании
    private int residents;

    // Конструктор, который вызывает конструктор суперкласса и принимает количество жильцов
    public ResidentialBuilding(String address, double area, int residents) {
        super(address, area);
        this.residents = residents;
    }

    // Метод, который возвращает тип здания
    public String getType() {
        return "Жилой";
    }

    // Метод, который возвращает количество жильцов в здании
    public int getResidents() {
        return residents;
    }
}
