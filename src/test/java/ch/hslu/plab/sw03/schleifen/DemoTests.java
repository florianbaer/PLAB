package ch.hslu.plab.sw03.schleifen;

import org.junit.Test;

public class DemoTests {

    @Test
    public void TestCountFromZeroToTenFor(){
        Demo.getOneToTenFor();
    }

    @Test
    public void TestCountFromZeroToTenDo(){
        Demo.getOneToTenDo();
    }

    @Test
    public void TestCountFromZeroToTenWhile(){
        Demo.getOneToTenWhile();
    }

    @Test
    public void incrementToOneTest(){
        Demo.incrementToOne();
    }

    @Test
    public void printBoxTest(){
        Demo.printBox(4, 4);
    }
}
