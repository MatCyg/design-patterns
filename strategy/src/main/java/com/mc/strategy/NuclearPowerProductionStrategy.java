package com.mc.strategy;

public class NuclearPowerProductionStrategy implements PowerPlantStrategy {
    @Override
    public void produceEnergy() {
        System.out.println("Producing energy from nuclear reaction...");
    }
}
