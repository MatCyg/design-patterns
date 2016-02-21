package com.mc.strategy;

public class WindPowerProductionStrategy implements PowerPlantStrategy {
    @Override
    public void produceEnergy() {
        System.out.println("Producing energy from wind...");
    }
}
