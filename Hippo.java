package inheritance;

public abstract class Hippo extends Animal{
    public Hippo(String name, String typeOfFood, int hunger, int boundaries, int location) {
        super(name, typeOfFood, hunger, boundaries, location);
    }
    @Override
    public abstract void eat();
    public String printAnimalSound() {
        return "All animals make noise";
    }
}
