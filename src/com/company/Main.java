//Matthew Johnson Project 3
package com.company;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {//
    public static Random ran;
    public static void main(String[] args) throws IOException {
        ran = new Random();
        Player Matt = new Player();
        Bad_Guy Joe = new Bad_Guy();
        Boss Tiffanee = new Boss();
        boolean check = true;
        Scanner reader = new Scanner(System.in);
        System.out.println("Would you like to play?");
        System.out.println("[1]Yes\n[2]No");
        int userInput = reader.nextInt();
        if(userInput == 1){
            check = true;
        }
        else if(userInput == 2) {
            check = false;
        }

        while(check) {
            if(Matt.getArmor() == 0) {
                System.out.println("What should your armor be?");
                int input = reader.nextInt();
                Matt.changeArmor(input);
            }
            Matt.swapWeapon();
            Joe.attackClose(Matt);
            Matt.attack(Joe);
            System.out.println(Matt.toString()+"\n"+Joe.toString()+"\n"+Tiffanee.toString());
            Matt.attack(Tiffanee);
            Tiffanee.attackClose(Matt);
            System.out.println(Matt.toString()+"\n"+Joe.toString()+"\n"+Tiffanee.toString());
            System.out.println("Would you like to keep playing?");
            System.out.println("[1]Yes\n[2]No");
            int userInput2 = reader.nextInt();
            if(userInput2 == 1){
                check = true;
            }
            else if(userInput2 == 2) {
                check = false;
            }
        }
    }
}
