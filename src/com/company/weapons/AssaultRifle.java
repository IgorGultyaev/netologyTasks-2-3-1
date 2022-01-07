package com.company.weapons;

public class AssaultRifle extends Guns {
    private boolean auto=false;
    private int range;

    public AssaultRifle(int firingRange, int firingRate, int shotEnergy) {
        super(1, firingRate, shotEnergy);
        this.range = firingRange;
    }

    public AssaultRifle(int firingRange, int firingRate, int shotEnergy, boolean auto) {
        super(20, 1, shotEnergy);
        this.range = firingRange;
        this.auto = auto;

    }

    @Override
    public String getShot() {
        StringBuilder shotBuilder = new StringBuilder(super.getShot());

        for (int numRate = 1; numRate <= this.range; numRate++) {
            shotBuilder.append(super.getShot());
        }

         return shotBuilder.toString();
    }
}
