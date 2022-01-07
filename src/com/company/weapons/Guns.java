package com.company.weapons;

import com.company.Weapon;

public class Guns extends Weapon {
    public Guns(int firingRange, int firingRate, int shotEnergy) {
        super((firingRange>3) ? 3 : firingRange, firingRate, shotEnergy);
        }
    @Override
    public String getShot() {
        StringBuilder builderShot = new StringBuilder();
        for (int range=1; range <= this.firingRange; range++){

            for (int rate = 1; rate <= firingRate; rate++){
                builderShot = builderShot.append(" ");
            }
            for (int energy= 1 ; energy <= shotEnergy; energy++){
                builderShot.append("■");
                //Thread.sleep(1000);
            }
            builderShot.append("□D");

        }
//        builderShot.append(" ");

        return builderShot.toString();
    }
}
//▣□■ツD▣