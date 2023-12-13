// Класс для представления группы студентов
class Group {
    // Поля для названия группы и двух подгрупп
    private String name;
    private Subgroup subgroup1;
    private Subgroup subgroup2;

    // Конструктор для создания группы с заданным названием и пустыми подгруппами
    public Group(String name) {
        this.name = name;
        subgroup1 = new Subgroup();
        subgroup2 = new Subgroup();
    }

    // Метод для получения названия группы
    public String getName() {
        return name;
    }

    // Метод для получения первой подгруппы
    public Subgroup getSubgroup1() {
        return subgroup1;
    }

    // Метод для получения второй подгруппы
    public Subgroup getSubgroup2() {
        return subgroup2;
    }

    // Метод для получения подгруппы по заданному индексу
    public Subgroup getSubgroup(int index) {
        // Если индекс равен 0, возвращаем первую подгруппу
        if (index == 0) {
            return subgroup1;
        }
        // Если индекс равен 1, возвращаем вторую подгруппу
        else if (index == 1) {
            return subgroup2;
        }
        // В противном случае, возвращаем null
        else {
            return null;
        }
    }
}
