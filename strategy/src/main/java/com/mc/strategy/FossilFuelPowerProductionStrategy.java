package com.mc.strategy;

public class FossilFuelPowerProductionStrategy implements PowerPlantStrategy {
    @Override
    public void produceEnergy() {
        System.out.println("Producing energy from fossil fuels...");
    }
}
