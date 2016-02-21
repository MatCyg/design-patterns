package com.mc;

import com.mc.strategy.PowerPlantStrategy;

public class PowerPlant {

    private final PowerPlantStrategy powerProductionStrategy;

    public PowerPlant(PowerPlantStrategy powerProductionStrategy) {
        this.powerProductionStrategy = powerProductionStrategy;
    }

    public void produceEnergy(){
        powerProductionStrategy.produceEnergy();
    }
}
