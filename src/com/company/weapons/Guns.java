package com.company.weapons;

public class Guns extends Weapon {
    private String shot;

    public Guns(int firingRange, int firingRate, int shotEnergy) {
        super((firingRange > 3) ? 3 : firingRange, firingRate, shotEnergy);
    }

    @Override
    public String getShot() {
        this.firingRange = this.firingRange > 3 ? 3 : this.firingRange;
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
