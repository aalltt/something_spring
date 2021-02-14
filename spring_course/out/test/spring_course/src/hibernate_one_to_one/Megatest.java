package hibernate_one_to_one;

public class Megatest {
    public static void main(String[] args) {
        Animal animal = new Animal("dd", 13);
        Cat cat = new Cat("barsik", 3);

        animal.setCat(cat);

        System.out.println(animal.toString());

    }
}
