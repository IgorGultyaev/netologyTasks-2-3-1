package com.company.weapons;

public class Weapon {
    protected int firingRange; //дальность стрельбы
    protected int firingRate;  //скорострельность
    protected int shotEnergy;  //енергия выстрела

    public Weapon(int firingRange, int firingRate, int shotEnergy) {
        this.firingRange = firingRange;
        this.firingRate = firingRate;
        this.shotEnergy = shotEnergy;
    }

    public String getShot() {
        StringBuilder builderShot = new StringBuilder();
        for (int range = 1; range <= this.firingRange; range++) {
            builderShot = builderShot.append("░");
            for (int rate = 1; rate <= firingRate; rate++) {
                builderShot = builderShot.append(" ");
            }
        }
        builderShot.append("▒▓▓");
        for (int energy = 1; energy <= shotEnergy; energy++) {
            builderShot.append("█");
        }
        return builderShot.toString();
    }

}


