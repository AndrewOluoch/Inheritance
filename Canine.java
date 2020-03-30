package inheritance;

public abstract class Canine extends Animal {
    public Canine(String name, String typeOfFood, int hunger, int boundaries, int location) {
        super(name, typeOfFood, hunger, boundaries, location);
    }

    @Override
    public abstract void eat();

    public String printAnimalSound() {
        return "All animals make noise";
    }
}
