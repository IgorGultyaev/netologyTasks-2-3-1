package com.company.weapons;

import com.company.Weapon;

public class CombatKnife extends Weapon {
    public CombatKnife(int shortEnergy){
        super(0, 0, shortEnergy);
    }

    @Override
    public String getShot() {
        switch (this.shotEnergy){
            case(1):

            return "-═══════ι▬▬";
            case(2):
                return "<%%%%|==========>";
            case(3):
                return "੧| ⊗ ▾ ⊗ |⊃¤=(————-";
            case(4):
                return "(===||:::::::::::::::>";
            case(5):
                return "cxxx|;:;:;:;:;:;:;:;>";
            case(6):
                return "ᗜಠ o ಠ)¤=[]:::::>";
            case(7):
                return "{}oo((X))ΞΞΞΞΞΞΞΞΞΞΞΞΞ>";
            case(8):
                return "|O/////[{:;:;:;:;:;:;:;:;>";
            case(9):
                return "o()xxxx[{::::::::::::::::::::::::::::::::::>";
            default:return "@xxxx[{::::::::::::::::::::::::::::::::::>";
        }
    }
}
