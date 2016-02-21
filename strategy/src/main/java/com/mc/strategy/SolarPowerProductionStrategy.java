package com.mc.strategy;

public class SolarPowerProductionStrategy implements PowerPlantStrategy {

    @Override
    public void produceEnergy() {
        System.out.println("Producing energy from solar collector...");
    }
}
