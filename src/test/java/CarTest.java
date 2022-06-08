import org.junit.Before;
import org.junit.Test;
import pl.kurs.wyrwalke.Car;
import pl.kurs.wyrwalke.Engine;
import pl.kurs.wyrwalke.Part;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class CarTest {

    private List<Car> list;
    private Engine e1;
    private Part p1;
    private Part p2;
    private List<Part> parts;
    private Car c1;

    @Before
    public void init() {

        p1 = new Part("Pasek wielorowkowy");
        p2 = new Part("Kolektor dolotowy");

        List<Part> parts = new ArrayList<>();
        parts.add(p1);
        parts.add(p2);

        e1 = new Engine(1000, "row", parts);
    }

    @Test

    public void shouldReturnTrueOnGetCar() {
        c1 = new Car("Opel", "Corsa", e1);
        Assert.assertEquals("Opel", c1.getMake());
    }

}
