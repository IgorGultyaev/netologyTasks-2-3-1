package com.company.weapons;

import com.company.Weapon;

public class Minigun extends Weapon {
    private final int MINSHOTENERGY = 1;
    private final int MAXSHOTENERGY = 9;
    private int accuraty;
    private String caliber;
    public Minigun(int firingRange, int firingRate, int shotEnergy, int accuracy){
        super(firingRange, firingRate, shotEnergy);
        this.accuraty = accuracy;
        if (this.shotEnergy <= MINSHOTENERGY) super.shotEnergy = MINSHOTENERGY;
        if (this.shotEnergy >= MAXSHOTENERGY) super.shotEnergy = MAXSHOTENERGY;
    }

    @Override
    public String getShot() {
        StringBuilder builderShot = new StringBuilder();
        switch (this.shotEnergy){
            case(1):
                caliber = "•";
                break;
            case(2):
                caliber = "●";
                break;
            case(4):
                caliber = "◉";
                break;
            case(5):
                caliber = "◖◗";
                break;
            case(6):
                caliber = "◖◗";
                break;
            case(7):
                caliber = "◯";
                break;
            case(8):
                caliber = "*";
                break;
            case(9):
                caliber = "⑇┅⑆⑉⑈";
                break;
        }
        for (int range = 1; range<= this.firingRange; range++){
            for (int rate = 1; rate<= this.firingRate; rate++) builderShot.append(caliber);
            for (int accur = 1; accur<= this.accuraty; accur++) builderShot.append(" ");
        }

 //        builderShot.append(" "); ⑉ ⑈ ⑇ ⑆   •

        return builderShot.toString();
    }
}
