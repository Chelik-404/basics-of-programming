// Класс Main, в котором тестируем работу паттерна "Строитель"
public class Main {

    public static void main(String[] args) {

        // Создаем объект Computer с процессором Intel Core i7, оперативной памятью 16 ГБ, жестким диском 512 ГБ и графической картой NVIDIA GeForce RTX 3080
        Computer computer1 = new Computer.ComputerBuilder("Intel Core i7")
                .setRam(16)
                .setHdd(512)
                .setGpu("NVIDIA GeForce RTX 3080")
                .build();

        // Выводим информацию о компьютере
        computer1.printInfo();

        // Создаем объект Computer с процессором AMD Ryzen 5, оперативной памятью 8 ГБ и жестким диском 256 ГБ и графической картой Radeon RX 7900 XTX.
        Computer computer2 = new Computer.ComputerBuilder("AMD Ryzen 5")
                .setRam(8)
                .setHdd(256)
                .setGpu("Amd Radeon RX 7900 XTX")
                .build();

        // Выводим информацию о компьютере
        computer2.printInfo();
    }
}
