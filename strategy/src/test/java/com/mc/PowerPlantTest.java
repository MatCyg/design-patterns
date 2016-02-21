package com.mc;

import com.mc.strategy.*;
import org.junit.Test;

public class PowerPlantTest {

    @Test
    public void testBiomassPowerPlant() {
        new PowerPlant(new BiomassPowerProductionStrategy()).produceEnergy();
    }

    @Test
    public void testFossilFuelPowerPlant() {
        new PowerPlant(new FossilFuelPowerProductionStrategy()).produceEnergy();
    }

    @Test
    public void testGeothermalPowerPlant() {
        new PowerPlant(new GeothermalPowerProductionStrategy()).produceEnergy();
    }

    @Test
    public void testHydroPowerPlant() {
        new PowerPlant(new HydroPowerProductionStrategy()).produceEnergy();
    }

    @Test
    public void testNuclearPowerPlant() {
        new PowerPlant(new NuclearPowerProductionStrategy()).produceEnergy();
    }

    @Test
    public void testSolarPowerPlant() {
        new PowerPlant(new SolarPowerProductionStrategy()).produceEnergy();
    }

    @Test
    public void testWindPowerPlant() {
        new PowerPlant(new WindPowerProductionStrategy()).produceEnergy();
    }

}
