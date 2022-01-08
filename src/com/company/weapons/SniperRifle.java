package com.company.weapons;

import com.company.Weapon;

public class SniperRifle extends Weapon {
    public SniperRifle(int firingRange, int firingRate, int shotEnergy) {
        super(firingRange, firingRate, shotEnergy);
    }

    @Override
    public String getShot() {
        return super.getShot()+"=D";
    }
}

