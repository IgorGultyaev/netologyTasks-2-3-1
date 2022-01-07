package com.company;

public class Player {
    private Weapon [] weaponSlot;
    private String name;

    public Player(String name, Weapon ... numSlot){
        this.weaponSlot = numSlot;
        this.name = name;
    }
    public int getSlotCount(){
        return this.weaponSlot.length;
    }
    public void shotWithWeapon(int slot){
        if (getSlotCount() > 0 && slot < getSlotCount())
            System.out.println(weaponSlot[slot].getShot());
    }
}
