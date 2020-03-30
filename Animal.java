package inheritance;

public abstract class Animal {
    //instance variable
    private String name;
    private String typeOfFood;
    private int hunger;
    private int boundaries;
    private int location;

    public Animal(String name){
        this.name = name;
    }

    public Animal(String name, String typeOfFood,int hunger, int boundaries, int location){
        this.name = name;
        this.typeOfFood = typeOfFood;
        this.hunger = hunger;
        this.boundaries = boundaries;
        this.location = location;
    }
    public String getName(){
        return name;
    }
    @Override
    public abstract void eat();
    public String printAnimalSound(){
        return "All animals make noise";
    }

}
