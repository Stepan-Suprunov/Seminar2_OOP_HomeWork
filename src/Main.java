// Домашнее задание к семинару №2 Объектно-ориентированное программирование Супрунов Степан

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Funtik", 8),
                new Cat("Simka", 6),
                new Cat("Kit", 3),
                new Cat("Leo", 7)
        };
        Plate plate = new Plate(10);
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        plate.info();
        plate.addFood(10);
        plate.info();
    }
}
