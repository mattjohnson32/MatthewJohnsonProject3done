package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Player extends GameEntity {
    private int weaponDamage;
    private int armor;
    private ArrayList<String> weapons;
    private ArrayList<Integer> damages;
    private String[] weaponList;
    Scanner reader = new Scanner(System.in);

    public Player() throws IOException {
        int i, j;
        weapons = new ArrayList<String>();
        damages = new ArrayList<Integer>();
        String allWeapons, path;
        path = "weapons";
        allWeapons = Files.readString((Paths.get(path)));
        weaponList = allWeapons.split("\n");
        for(i = 0; i < weaponList.length; i += 2)
            weapons.add(weaponList[i]);
        for(j = 1; j < weaponList.length; j += 2)
            damages.add(Integer.parseInt(weaponList[j].replaceAll("\\s","")));
    }

    public void swapWeapon () {
        for (int i = 0; i < weapons.size(); i++)
            System.out.println((i + 1) + ". " + weapons.get(i));

        System.out.println("What weapon would you like to choose?");
        int input = reader.nextInt();
        weaponDamage = damages.get(input- 1);
    }

    public void changeArmor ( int armorValue){
        armor = armorValue;
    }

    public int getArmor () {
        return armor;
    }

    public void attack (Bad_Guy enemy){
        enemy.takeDamage(weaponDamage);
    }

    @Override
    public void takeDamage ( int damage){
        this.Health -= (damage - (armor / 1000));
    }

    public String toString () {
        return new String("Player:\nWeapon Damage: " + weaponDamage + "\nArmor: " + armor + "\nHealth: " + this.Health);
    }
}
