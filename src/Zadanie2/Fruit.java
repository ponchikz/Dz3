package Zadanie2;

public abstract class Fruit {
    private String name;
    private Integer cartonWeight; //вес коробки

    public Fruit(String name, Integer cartonWeight ) {
        this.name = name;
        this.cartonWeight = cartonWeight;
    }

    public String getName() {
        return this.name;
    }

    public Integer getCartonWeight() {return this.cartonWeight; }

}
