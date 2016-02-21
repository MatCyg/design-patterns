package com.mc.strategy;

public class GeothermalPowerProductionStrategy implements PowerPlantStrategy {
    @Override
    public void produceEnergy() {
        System.out.println("Producing energy from geothermal fluids...");
    }
}
