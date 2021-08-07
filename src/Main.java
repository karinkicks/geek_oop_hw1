import builder.Person;
import figures.Circle;
import figures.Figure;
import figures.Square;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        Person person = new Person.Builder()
                .addFirstName("Karina")
                .addLastName("Rybchenko")
                .addMiddleName("Sergevna")
                .addAge(25)
                .addAddress("test")
                .addCountry("test")
                .addPhone("123")
                .addGender("F")
                .build();

        System.out.println(person.getAddress());

        Figure f = new Square(1,"red");
        System.out.println(f.square());

        Circle c = new Circle(1, "yellow");
        c.draw();
        System.out.println(c.perimeter());

    }

}
