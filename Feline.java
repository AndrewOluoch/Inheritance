package inheritance;

public abstract class Feline extends Animal {
    public Feline(String name, String typeOfFood, int hunger, int boundaries, int location) {
        super(name, typeOfFood, hunger, boundaries, location);
    }
    @Override
    public abstract void eat();
    public String printAnimalSound() {
        return "All animals make noise";
    }
}
