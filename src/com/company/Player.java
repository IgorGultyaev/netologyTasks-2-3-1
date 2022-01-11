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
        if (getSlotCount() > 0 && slot < getSlotCount() && slot >= 0 && slot != -1)
            System.out.println(weaponSlot[slot].getShot());
        else System.out.println("there are no weapons in this slot");
    }
    public String getName(){
        return this.name;
    }
}
