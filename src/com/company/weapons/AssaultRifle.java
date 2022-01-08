package com.company.weapons;

public class AssaultRifle extends Guns {
   private int range;

    public AssaultRifle(int firingRange, int firingRate, int shotEnergy) {
        super(1, firingRate, shotEnergy);
        this.range = firingRange;

    }
    public AssaultRifle(int firingRange, int shotEnergy) {
        super(firingRange, 1, shotEnergy);
        this.range = firingRange;
    }

    public String getShot(){
        StringBuilder shotBuilder = new StringBuilder(super.getShot());
        for (int numRate = 1; numRate <= this.range; numRate++) {
            shotBuilder.append(super.getShot());
        }
        return shotBuilder.toString();
    }
}
