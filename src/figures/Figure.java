package figures;

import lombok.Data;

public abstract class Figure {
    private double width;
    private String color;

    public Figure(double width, String color){
        this.width=width;
        this.color=color;
    }

    public Figure() {
    }

    public abstract double square();
    public double perimeter(){
        return 2*3.14*width;
    };
}
