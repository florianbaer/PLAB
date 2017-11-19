package ch.hslu.plab.sw09;

import org.junit.Test;

public class TemperatureCreation {

    @Test
    public void TesteMutabilityOfTemperature(){
        org.mutabilitydetector.unittesting.MutabilityAssert.assertImmutable(Temperature.class);
    }
}
