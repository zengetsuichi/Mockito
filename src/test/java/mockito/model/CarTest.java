package mockito.model;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CarTest {

    private Car car;

    @Before
    public void init() {
        car = Mockito.mock(Car.class);
    }

    @Test
    public void shouldReturnFerrariOnGetProducer() {

        Mockito.when(car.getProducer()).thenReturn("Ferrari");
        assertEquals("Ferrari", car.getProducer());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionOnGetProducer() {

        Mockito.when(car.getProducer()).thenThrow(new IllegalArgumentException());
        car.getProducer();
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIlllegalArgumnetExceptionOnSetProducerWithDupa() {

        Mockito.doThrow(new IllegalArgumentException()).when(car).setProducer("dupa");
        car.setProducer("dupa");
    }

    @Test
    public void test(){
        car.setProducer("Wyrwalke");

        Mockito.verify(car, Mockito.atLeastOnce()).setProducer(Mockito.anyString());
        Mockito.verify(car, Mockito.times(1)).setProducer(Mockito.anyString());
        Mockito.verify(car, Mockito.atMost(5)).setProducer(Mockito.anyString());
        Mockito.verify(car, Mockito.atLeastOnce()).setProducer(Mockito.matches("\\w+"));
        Mockito.verify(car, Mockito.atLeastOnce()).setProducer(Mockito.endsWith("ke"));
        Mockito.verify(car, Mockito.atLeastOnce()).setProducer(Mockito.contains("wal"));
        Mockito.verify(car, Mockito.atLeastOnce()).setProducer(Mockito.any());
    }

}