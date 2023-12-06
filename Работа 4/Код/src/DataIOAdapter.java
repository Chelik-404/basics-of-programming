// Класс-адаптер для преобразования интерфейса DataIO в другой интерфейс
class DataIOAdapter implements DataIO {
    // Атрибут для хранения объекта, который реализует другой интерфейс
    private Object adaptee;

    // Конструктор, который принимает объект, который реализует другой интерфейс
    public DataIOAdapter(Object adaptee) {
        this.adaptee = adaptee;
    }

    // Метод для чтения данных из файла с помощью адаптируемого объекта
    public void readData(String fileName) {
        // Вызов соответствующего метода адаптируемого объекта
        if (adaptee instanceof CSVDataIO) {
            ((CSVDataIO) adaptee).readData(fileName);
        } else if (adaptee instanceof JSONDataIO) {
            ((JSONDataIO) adaptee).readData(fileName);
        } else if (adaptee instanceof XMLDataIO) {
            ((XMLDataIO) adaptee).readData(fileName);
        }
    }

    // Метод для записи данных в файл с помощью адаптируемого объекта
    public void writeData(String fileName, String data) {
        // Вызов соответствующего метода адаптируемого объекта
        if (adaptee instanceof CSVDataIO) {
            ((CSVDataIO) adaptee).writeData(fileName, data);
        } else if (adaptee instanceof JSONDataIO) {
            ((JSONDataIO) adaptee).writeData(fileName, data);
        } else if (adaptee instanceof XMLDataIO) {
            ((XMLDataIO) adaptee).writeData(fileName, data);
        }
    }
}
