// Класс Computer, который представляет объект компьютера
public class Computer {

    // Параметры компьютера
    private String processor;
    private int ram;
    private int hdd;
    private String gpu;

    // Конструктор, который принимает объект ComputerBuilder
    public Computer(ComputerBuilder builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.gpu = builder.gpu;
    }

    // Геттеры для параметров компьютера
    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getGpu() {
        return gpu;
    }

    // Метод для вывода информации о компьютере
    public void printInfo() {
        System.out.println("Компьютер с процессором " + processor + ", оперативной памятью " + ram + " ГБ, жестким диском " + hdd + " ГБ и графической картой " + gpu + ".");
    }

    // Статический вложенный класс ComputerBuilder, который реализует паттерн "Строитель"
    public static class ComputerBuilder {

        // Параметры компьютера, которые будут установлены в конструкторе Computer
        private String processor;
        private int ram;
        private int hdd;
        private String gpu;

        // Конструктор, который принимает обязательный параметр процессор
        public ComputerBuilder(String processor) {
            this.processor = processor;
        }

        // Методы для установки необязательных параметров оперативной памяти, жесткого диска и графической карты
        public ComputerBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setHdd(int hdd) {
            this.hdd = hdd;
            return this;
        }

        public ComputerBuilder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        // Метод для создания объекта Computer с установленными параметрами
        public Computer build() {
            return new Computer(this);
        }
    }
}
