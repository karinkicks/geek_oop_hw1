package figures;

import lombok.Data;


public class Square extends Figure{

    private double a;
    private String color;

    public Square(double a, String color) {
        this.a=a;
        this.color=color;
    }

    @Override
    public double square() {
        return Math.pow(a,2);
    }

    @Override
    public double perimeter() {
        return 4*a;
    }
}
