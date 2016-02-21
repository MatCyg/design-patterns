package com.mc.strategy;

public class BiomassPowerProductionStrategy implements PowerPlantStrategy {

    @Override
    public void produceEnergy() {
        System.out.println("Producing energy from biomass...");
    }
}
