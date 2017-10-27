package ch.hslu.plab.sw06;

import ch.hslu.plab.sw05.Circle;
import ch.hslu.plab.sw05.GeometricalObject;
import ch.hslu.plab.sw05.Rectangle;
import ch.hslu.plab.sw05.Shape;
import org.junit.Assert;
import org.junit.Test;

public class SubtypingTests {

    @Test
    public void CastSubtypeToBaseShapeTest(){
        // Implizites CASTING
        Shape rectangle = new Rectangle(5, 5, 10,10);
        Shape circle = new Circle(5, 15, 5);

        //WOW SOGAR IN INTERFACE
        GeometricalObject interfaceCastedCircle = circle;
        Assert.assertEquals(5, interfaceCastedCircle.getX());
        Assert.assertEquals(15, interfaceCastedCircle.getY());

        // INSAAAANE - IT WORKS!!!!!!! *MINDBLOW*
        rectangle.move(1, 1);

        // AND WHY?? <- because it's on the shape-class implemented
        // https://media0.giphy.com/media/26ufdipQqU2lhNA4g/giphy.gif
        circle.move(2,2);

        Assert.assertEquals(5, ((Circle) circle).getDiameter());

        //DAS IST NICHT POLYMORPHIE - DAS IST MAGIE!!!!
    }

    @Test
    public void CreateInstanceOfElementTest(){
        Element mercury = new Mercury();
        mercury.toString();
    }
}
