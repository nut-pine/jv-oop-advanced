package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid  extends Shape {

    Random rand;
    private StringBuilder sb = new StringBuilder();
    private int sideA;
    private int sideB;
    private int sideC;

    public IsoscelesTrapezoid(String name, String color){
        super(name, color);
        rand = new Random();
        this.sideA = rand.nextInt(10);
        this.sideB = rand.nextInt(20);
        this.sideC = rand.nextInt(15);
    }

    @Override
    public double calculateArea() {
        return this.averageLine() * this.height();
    }

    @Override
    public double perimeter() {
        return 2 * sideC + sideA + sideB;
    }

    @Override
    public void draw() {}

    @Override
    public String info() {
        return sb.append("Shape: ").append(super.getName()+ ", ").append("area: " + this.calculateArea() + " sq.units")
                .append("height: " + this.height() + " units ")
                .append("color: " + super.getColor()).toString();
    }

    public double averageLine() {
        return (sideB + sideA) / 2;
    }

    public double height() {
        return Math.sqrt((sideC * sideC) - 1/4 * ((sideB * sideB) - (sideA * sideA)));
    }
}
