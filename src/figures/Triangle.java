package figures;

public class Triangle extends Figure{

    private double a;
    private double h;
    private String color;

    public Triangle(double a, double h, String color) {
        this.a=a;
        this.h=h;
        this.color=color;
    }

    @Override
    public double square() {
        return 0.5*a*h;
    }

    @Override
    public double perimeter() {
        return 2*(Math.sqrt(Math.pow(a,2)-Math.pow(h,2)))+2*a;
    }
}
