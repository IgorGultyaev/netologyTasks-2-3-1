package com.company.weapons;

public class SniperRifle extends Weapon {
    public SniperRifle(int firingRange, int firingRate, int shotEnergy) {
        super(firingRange, firingRate, shotEnergy);
    }

    @Override
    public String getShot() {
        return super.getShot() + "=D";
    }
}

