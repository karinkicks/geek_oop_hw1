package figures;

public class Circle extends Figure implements Drawing{
    private double r;
    private String color;

    public Circle(double r, String color) {
        super(r, color);
        this.r=r;
        this.color=color;
    }

    @Override
    public double square(){
        return 3.14*Math.pow(r,2);
    }

    @Override
    public double perimeter(){
        return super.perimeter();
    }

    @Override
    public void draw() {
        System.out.println("Drawing... " + color);
    }
}
