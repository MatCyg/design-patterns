package com.mc.strategy;

public class HydroPowerProductionStrategy implements PowerPlantStrategy {
    @Override
    public void produceEnergy() {
        System.out.println("Producing energy from water...");
    }
}
