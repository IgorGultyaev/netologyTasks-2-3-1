package com.company.weapons;

public class Minigun extends Weapon {
    private final int MIN_SHOT_ENERGY = 1;
    private final int MAX_SHOT_ENERGY = 9;
    private int accuracy;

    public Minigun(int firingRange, int firingRate, int shotEnergy, int accuracy) {
        super(firingRange, firingRate, shotEnergy);
        this.accuracy = accuracy;
        if (this.shotEnergy <= MIN_SHOT_ENERGY) {
            super.shotEnergy = MIN_SHOT_ENERGY;
        }

        if (this.shotEnergy >= MAX_SHOT_ENERGY) {
            super.shotEnergy = MAX_SHOT_ENERGY;
        }
    }

    @Override
    public String getShot() {
        StringBuilder builderShot = new StringBuilder();
        String caliber;
        switch (this.shotEnergy) {
            case (1):
                caliber = "•";
                break;
            case (2):
                caliber = "●";
                break;
            case (3):
                caliber = "(())";
                break;
            case (4):
                caliber = "◉";
                break;
            case (5):
                caliber = "◖◗";
                break;
            case (6):
                caliber = "◖◗";
                break;
            case (7):
                caliber = "◯";
                break;
            case (8):
                caliber = "*";
                break;
            case (9):
                caliber = "⑇┅⑆⑉⑈";
                break;
            default:
                caliber = "@";
                break;
        }

        for (int range = 1; range <= 200000; range++) {

        }
        for (int range = 1; range <= this.firingRange; range++) {
            for (int rate = 1; rate <= this.firingRate; rate++) builderShot.append(caliber);
            for (int accur = 1; accur <= this.accuracy; accur++) builderShot.append(" ");
        }

        return builderShot.toString();
    }
}
