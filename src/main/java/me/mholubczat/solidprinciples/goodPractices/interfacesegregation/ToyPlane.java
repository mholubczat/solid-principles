package me.mholubczat.solidprinciples.goodPractices.interfacesegregation;

public class ToyPlane implements Toy, Movable, Flyable {
    double price;
    String color;

    @Override
    public void setPrice(double price) {
        this.price=price;
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public void fly() {
        System.out.println("Toyplane flies");
    }

    @Override
    public void move() {
        System.out.println("Toyplane moves");

    }

    @Override
    public String toString() {
        return "ToyPlane: Moveable and flyable toy plane- Price: "+price+" Color: "+color;
    }
}
