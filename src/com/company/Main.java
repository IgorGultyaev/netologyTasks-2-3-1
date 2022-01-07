package com.company;

import com.company.weapons.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("Winner",
                new Guns(5,10,3),
                new Minigun(10,10,8,1),
                new SniperRifle(10,10,8),
                new CombatKnife(10),
                new AssaultRifle(10,10,5),
                new AssaultRifle(10,10,5, true)
                );
        Scanner scanner = new Scanner(System.in);
        int slot = scanner.nextInt();
        player.shotWithWeapon(slot);

//        Weapon[] weapon = new Weapon[7];
//        weapon[0] = new Guns(5,10,3);
//        weapon[1] = new Minigun(10,10,8,1);
//        weapon[2] = new SniperRifle(10,10,8);
//        weapon[3] = new CombatKnife(10);
//        weapon[4] = new AssaultRifle(10,10,5);
//        weapon[5] = new AssaultRifle(10,10,3, true);
//        System.out.println(weapon[0].getShot());
//        System.out.println(weapon[1].getShot());
//        System.out.println(weapon[2].getShot());
//        System.out.println(weapon[3].getShot());
//        System.out.println(weapon[4].getShot());
//        System.out.println(weapon[5].getShot());
    }
}
