package com.company;

public class Weapon {
    protected int firingRange; //дальность стрельбы
    protected int firingRate;  //скорострельность
    protected int shotEnergy;  //енергия выстрела
    public void shot(Weapon weapon) {
        System.out.println();
    }
    public Weapon(int firingRange, int firingRate, int shotEnergy){
        this.firingRange = firingRange;
        this.firingRate = firingRate;
        this.shotEnergy = shotEnergy;
    }

}


