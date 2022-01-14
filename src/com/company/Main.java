package com.company;

import com.company.weapons.*;

import java.util.Scanner;

public class Main {

    public static int rnd(int min, int max) {
        return (int) (Math.random() * ++max) + min;
    }

    public static Weapon[] setting() {
        Weapon[] weapon = new Weapon[6];
        weapon[0] = new Guns(rnd(1, 10), rnd(1, 10), rnd(1, 10));
        weapon[1] = new Minigun(rnd(1, 10), rnd(1, 10), rnd(1, 10), rnd(1, 9));
        weapon[2] = new SniperRifle(rnd(1, 10), rnd(1, 10), rnd(1, 10));
        weapon[3] = new CombatKnife(rnd(1, 9));
        weapon[4] = new AssaultRifle(rnd(1, 10), rnd(1, 10), rnd(1, 10));
        weapon[5] = new AssaultRifle(rnd(1, 10), rnd(1, 10));
        return weapon;
    }

    public static void main(String[] args) {
        Player player = new Player("Winner", setting());
        System.out.format("У %s %d слотов с оружием, "
                        + "Введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getName(),
                player.getSlotCount());

        Scanner scanner = new Scanner(System.in);
        int slot = 1;
        while (slot != -1) {
            slot = scanner.nextInt();
            player.shotWithWeapon(slot - 1);
        }
        System.out.println("Game over!");

    }
}
