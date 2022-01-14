package com.company.weapons;

public class Guns extends Weapon {
    private String shot;

    public Guns(int firingRange, int firingRate, int shotEnergy) {
        super(Math.min(firingRange, 3), firingRate, shotEnergy);
    }

    @Override
    public String getShot() {
        this.firingRange = Math.min(this.firingRange, 3);
        StringBuilder builderShot = new StringBuilder();
        for (int range = 1; range <= this.firingRange; range++) {

            for (int rate = 1; rate <= firingRate; rate++) {
                builderShot = builderShot.append(" ");
            }
            for (int energy = 1; energy <= shotEnergy; energy++) {
                builderShot.append("■");
            }
            builderShot.append("□D");
            this.shot = builderShot.toString();
        }
        return this.shot;
    }
}
