// Класс PetFactory, который использует фабричный метод для создания объектов разных видов домашних животных
class PetFactory {
    // Метод, который принимает тип и имя домашнего животного и возвращает соответствующий объект
    public Pet createPet(String type, String name) {
        // Если тип домашнего животного - собака, то создать и вернуть объект класса Dog
        if (type.equalsIgnoreCase("dog")) {
            return new Dog(name);
        }
        // Если тип домашнего животного - кошка, то создать и вернуть объект класса Cat
        else if (type.equalsIgnoreCase("cat")) {
            return new Cat(name);
        }
        // Если тип домашнего животного - попугай, то создать и вернуть объект класса Parrot
        else if (type.equalsIgnoreCase("parrot")) {
            return new Parrot(name);
        }
        // Иначе вернуть null
        else {
            return null;
        }
    }
}
