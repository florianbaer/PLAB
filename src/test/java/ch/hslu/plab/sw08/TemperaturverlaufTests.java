package ch.hslu.plab.sw08;

import ch.hslu.plab.sw03.kontrollstrukturen.Temperature;
import ch.hslu.plab.sw06.Point;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TemperaturverlaufTests {

    @Test
    public void temperatureVerlaufTests(){
        Temperaturverlauf verlauf = new Temperaturverlauf();

        ArrayList<Temperature> temperaturen = new ArrayList<Temperature>();
        temperaturen.add(new Temperature(23));
        temperaturen.add(new Temperature(33));
        temperaturen.add(new Temperature(53));
        temperaturen.add(new Temperature(73));

        verlauf.setTemperaturen(temperaturen);

        Assert.assertEquals(4, verlauf.getCount());
        Assert.assertEquals(73, verlauf.getMaxTemp(), 0.1);
        Assert.assertEquals(23, verlauf.getMinTemp(), 0.1);
        Assert.assertEquals(45.5, verlauf.getAverage(), 0.1);
    }
}
