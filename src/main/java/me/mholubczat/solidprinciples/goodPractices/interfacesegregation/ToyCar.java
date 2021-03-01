package me.mholubczat.solidprinciples.goodPractices.interfacesegregation;

public class ToyCar implements Toy, Movable{

    double price;
    String color;

    @Override
    public void move() {
        System.out.println("Toycar moves");
    }

    @Override
    public void setPrice(double price) {
        this.price=price;
    }

    @Override
    public void setColor(String color) {
       this.color = color;
    }

    @Override
    public String toString(){
        return "ToyCar: Moveable Toy car- Price: "+price+" Color: "+color;
    }
}
